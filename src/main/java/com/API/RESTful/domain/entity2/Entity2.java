package com.API.RESTful.domain.entity2;

import com.API.RESTful.domain.entity1.Entity1;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "entity2")
@Getter
@Setter
public class Entity2 implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    long id;

    @NotEmpty
    @NotBlank
    @Size(max = 120)
    @Column(name = "val4")
    private String val4;

    @NotEmpty
    @NotBlank
    @Size(max = 120)
    @Column(name = "val5")
    private String val5;

    @NotEmpty
    @NotBlank
    @Size(max = 120)
    @Column(name = "val6")
    private String val6;

    @NotNull
    @Column(name = "data_inicio")
    @Temporal(TemporalType.TIMESTAMP) // yyyy-MM-dd HH:mm:ss
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date data;

    @JsonIgnore
    @OneToMany(mappedBy = "entity2", cascade = CascadeType.ALL)
    private List<Entity1> entity1;
}

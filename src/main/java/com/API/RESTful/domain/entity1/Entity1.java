package com.API.RESTful.domain.entity1;

import com.API.RESTful.domain.entity2.Entity2;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "entity1")
@Getter
@Setter
public class Entity1 implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    long id;

    @NotEmpty
    @NotBlank
    @Size(max = 120)
    @Column(name = "val1")
    private String val1;

    @NotEmpty
    @NotBlank
    @Size(max = 120)
    @Column(name = "val2")
    private String val2;

    @NotEmpty
    @NotBlank
    @Size(max = 120)
    @Column(name = "val3")
    private String val3;

    @NotNull
    @JoinColumn(name = "entity2_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private Entity2 entity2;
}

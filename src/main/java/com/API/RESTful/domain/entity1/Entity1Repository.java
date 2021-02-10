package com.API.RESTful.domain.entity1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Entity1Repository extends JpaRepository<Entity1, Long> {
}

package com.API.RESTful.domain.entity1;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
//public interface Entity1Repository extends JpaRepository<Entity1, Long> {
//}
public interface Entity1Repository extends MongoRepository<Entity1, Long> {
}

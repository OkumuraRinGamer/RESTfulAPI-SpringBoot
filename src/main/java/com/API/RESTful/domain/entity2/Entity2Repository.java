package com.API.RESTful.domain.entity2;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
//public interface Entity2Repository extends JpaRepository<Entity2, Long> {
//}
public interface Entity2Repository extends MongoRepository<Entity2, Long> {
}


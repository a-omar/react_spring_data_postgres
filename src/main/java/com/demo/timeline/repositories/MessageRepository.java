package com.demo.timeline.repositories;

import com.demo.timeline.models.Message;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.Id;
import java.util.List;

//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;

//public interface MessageRepository extends MongoRepository<Message,Long>{
//
//    @Override
//    @Query("{id:'?0'}")
//    Message findOne(Long id);
//
//    @Override
//    Page<Message> findAll(Pageable pageable);
//
//}
//@RepositoryRestResource(collectionResourceRel = "message", path = "messages")
// tag::code[]
public interface MessageRepository extends CrudRepository<Message,Long> {

    @Override
    Message findOne(Long id);

    @Override
    List<Message> findAll();
}
// end::code[]
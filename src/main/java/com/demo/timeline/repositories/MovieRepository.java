package com.demo.timeline.repositories;

import com.demo.timeline.models.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.repository.Repository;
//import org.springframework.data.repository.query.Param;
import org.springframework.data.web.PageableDefault;
//import org.springframework.stereotype.Controller;

import java.util.List;


//public interface MovieRepository extends MongoRepository<Movie,String>{
//
//    @Override
////    @Query("{id:'?'}")
//    Movie findOne(String id);
//
//    @Override
//    Page<Movie> findAll(@PageableDefault(page = 0, value = 2) Pageable pageable);
//
//}

public interface MovieRepository extends PagingAndSortingRepository<Movie, Long> {

    @Override
//    @Query("{id:'?'}")
    Movie findOne(Long id);

    @Override
    List<Movie> findAll();

    @Override
    Page<Movie> findAll(@PageableDefault(page = 0, value = 2) Pageable pageable);

}
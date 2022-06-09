package com.poltomo.HibernateDemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poltomo.HibernateDemo.models.Post;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer>{
    //JPARepository
    List<Post> findByUserId(Integer id);
}

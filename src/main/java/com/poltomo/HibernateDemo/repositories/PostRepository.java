package com.poltomo.HibernateDemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poltomo.HibernateDemo.models.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer>{

}

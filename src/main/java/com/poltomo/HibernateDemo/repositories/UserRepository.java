package com.poltomo.HibernateDemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poltomo.HibernateDemo.models.User;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
    //JPARepository
    List<User> findByLocationId(Integer id);
}

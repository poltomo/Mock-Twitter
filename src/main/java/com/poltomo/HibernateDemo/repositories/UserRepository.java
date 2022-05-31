package com.poltomo.HibernateDemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poltomo.HibernateDemo.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}

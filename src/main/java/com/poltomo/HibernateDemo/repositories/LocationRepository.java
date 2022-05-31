package com.poltomo.HibernateDemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poltomo.HibernateDemo.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer>{

}

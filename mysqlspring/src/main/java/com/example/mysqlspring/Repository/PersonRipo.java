package com.example.mysqlspring.Repository;

import com.example.mysqlspring.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRipo extends CrudRepository<Person,Integer> {
}

package com.example.BusinessMGTSpring.Repository;

import com.example.BusinessMGTSpring.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRipo extends CrudRepository<Person,Integer> {
}

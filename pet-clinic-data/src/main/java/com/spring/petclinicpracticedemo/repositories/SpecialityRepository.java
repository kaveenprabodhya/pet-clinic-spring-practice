package com.spring.petclinicpracticedemo.repositories;

import com.spring.petclinicpracticedemo.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}

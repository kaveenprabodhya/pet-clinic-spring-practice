package com.spring.petclinicpracticedemo.repositories;

import com.spring.petclinicpracticedemo.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}

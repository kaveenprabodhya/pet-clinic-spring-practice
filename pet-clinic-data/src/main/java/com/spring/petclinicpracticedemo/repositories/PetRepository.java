package com.spring.petclinicpracticedemo.repositories;

import com.spring.petclinicpracticedemo.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}

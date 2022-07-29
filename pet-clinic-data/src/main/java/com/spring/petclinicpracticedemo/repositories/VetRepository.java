package com.spring.petclinicpracticedemo.repositories;

import com.spring.petclinicpracticedemo.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}

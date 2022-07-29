package com.spring.petclinicpracticedemo.repositories;

import com.spring.petclinicpracticedemo.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}

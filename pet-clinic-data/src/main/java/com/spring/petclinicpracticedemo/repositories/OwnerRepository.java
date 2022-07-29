package com.spring.petclinicpracticedemo.repositories;

import com.spring.petclinicpracticedemo.model.Owner;
import com.spring.petclinicpracticedemo.services.CrudService;

import java.util.List;

public interface OwnerRepository extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}

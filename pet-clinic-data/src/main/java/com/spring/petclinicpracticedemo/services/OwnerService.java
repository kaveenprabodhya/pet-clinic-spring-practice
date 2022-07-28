package com.spring.petclinicpracticedemo.services;

import com.spring.petclinicpracticedemo.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastname(String lastname);

//    Owner findById(Long id);

//    Owner save(Owner owner);

//    Set<Owner> findAll();
}

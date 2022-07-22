package com.spring.petclinic.services;

import com.spring.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastname(String lastname);

//    Owner findById(Long id);

//    Owner save(Owner owner);

//    Set<Owner> findAll();
}

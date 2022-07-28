package com.spring.petclinicpracticedemo.services;

import com.spring.petclinicpracticedemo.model.Owner;

import java.util.List;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
 }

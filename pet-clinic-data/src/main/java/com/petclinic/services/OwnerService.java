package com.petclinic.services;

import com.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner finByLastName(String lastName);
    Owner findById(Long id);
    Set<Owner> findAll();
    Owner save(Owner owner);
}

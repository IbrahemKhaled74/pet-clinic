package com.petclinic.repositries;

import com.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

interface OwnerRepository extends CrudRepository<Owner,Long> {
}

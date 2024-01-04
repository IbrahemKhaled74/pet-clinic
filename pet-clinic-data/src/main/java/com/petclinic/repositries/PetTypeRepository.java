package com.petclinic.repositries;

import com.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

interface PetTypeRepository extends CrudRepository<PetType,Long> {
}

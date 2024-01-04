package com.petclinic.repositries;

import com.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

interface PetRepository extends CrudRepository<Pet,Long> {
}

package com.petclinic.repositries;

import com.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

interface VetRepository extends CrudRepository<Vet,Long> {
}

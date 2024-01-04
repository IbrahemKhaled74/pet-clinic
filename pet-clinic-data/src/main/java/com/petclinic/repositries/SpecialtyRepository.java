package com.petclinic.repositries;

import com.petclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

interface SpecialtyRepository extends CrudRepository<Speciality,Long> {
}

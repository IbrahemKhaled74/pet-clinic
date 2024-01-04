package com.petclinic.repositries;

import com.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

interface VisitRepository extends CrudRepository<Visit,Long> {
}

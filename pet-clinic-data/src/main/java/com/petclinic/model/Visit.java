package com.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class Visit extends BaseEntity {
    LocalDate date;
    String description;
    Pet pet;
}

package com.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Locale;
@Setter
@Getter
public class Pet extends BaseEntity {
    private PetType petType;
    private Owner owner;
    private Locale birthDate;
}

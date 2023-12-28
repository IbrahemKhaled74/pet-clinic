package com.petclinic.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Locale;
@Setter
@Getter
public class Pet {
    private PetType petType;
    private Owner owner;
    private Locale birthDate;
}

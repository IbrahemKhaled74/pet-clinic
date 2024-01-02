package com.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
public class Owner extends Person {
    Set<Pet>pets;
}

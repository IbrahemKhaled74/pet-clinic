package com.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
public class Owner extends Person {
    private String address;
    private String phone;
    private String city;
    private Set<Pet>pets=new HashSet<>();
}

package com.petclinic.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Vet extends Person {
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "vet_specialities" ,
            joinColumns = @JoinColumn(name = "vet_id")
            ,inverseJoinColumns = @JoinColumn(name = "speciality_id"
    ))
    private Set<Speciality>specialities=new HashSet<>();
}

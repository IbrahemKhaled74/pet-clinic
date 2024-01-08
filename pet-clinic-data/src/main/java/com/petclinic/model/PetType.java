package com.petclinic.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PetType extends BaseEntity {
    private String name;
    @Builder
    public PetType(Long id, String name) {
        super(id);
        this.name = name;
    }

}

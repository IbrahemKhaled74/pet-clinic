package com.petclinic.bootstrab;

import com.petclinic.model.Owner;
import com.petclinic.model.Pet;
import com.petclinic.model.PetType;
import com.petclinic.model.Vet;
import com.petclinic.services.OwnerService;
import com.petclinic.services.PetService;
import com.petclinic.services.VetService;
import com.petclinic.services.map.OwnerMapService;
import com.petclinic.services.map.VetMapService;
import org.hibernate.annotations.Comment;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Component
public class DataInitializer implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetService petService;

    public DataInitializer(OwnerService ownerService, VetService vetService, PetService petService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petService = petService;
    }


    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        Pet mikesPet = new Pet();
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());


        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        Pet fionasCat = new Pet();
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());

        ownerService.save(owner2);


        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");

    }
}

package com.spring.petclinicpracticedemo.bootstrap;

import com.spring.petclinicpracticedemo.model.Owner;
import com.spring.petclinicpracticedemo.model.Vet;
import com.spring.petclinicpracticedemo.services.OwnerService;
import com.spring.petclinicpracticedemo.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    public final OwnerService ownerService;
    public final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstname("Michael");
        owner1.setLastname("Winston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstname("Fiona");
        owner2.setLastname("Glen");

        ownerService.save(owner2);

        System.out.println("Loaded owners");

        Vet vet1 = new Vet();
        vet1.setFirstname("Sam");
        vet1.setLastname("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstname("Jessica");
        vet2.setLastname("Buffay");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}

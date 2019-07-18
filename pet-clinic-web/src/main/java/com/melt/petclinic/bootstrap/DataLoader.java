package com.melt.petclinic.bootstrap;

import com.melt.petclinic.model.Owner;
import com.melt.petclinic.model.Vet;
import com.melt.petclinic.services.OwnerService;
import com.melt.petclinic.services.VetService;
import com.melt.petclinic.services.map.OwnerServiceMap;
import com.melt.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Serg");
        owner1.setLastName("Did");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Alex");
        owner1.setLastName("Rod");

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Anna");
        vet1.setLastName("Helper");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Ganna");
        vet2.setLastName("Helper2");

        vetService.save(vet2);

    }
}

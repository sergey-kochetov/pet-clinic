package com.melt.petclinic.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class Pet extends Person {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}

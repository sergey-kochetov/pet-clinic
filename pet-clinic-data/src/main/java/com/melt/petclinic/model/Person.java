package com.melt.petclinic.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    private Long id;

    private String firstName;
    private String lastName;

}

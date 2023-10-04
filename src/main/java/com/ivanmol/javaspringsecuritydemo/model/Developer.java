package com.ivanmol.javaspringsecuritydemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Developer {
    private Long id;
    private String firstName;
    private String lastName;
}

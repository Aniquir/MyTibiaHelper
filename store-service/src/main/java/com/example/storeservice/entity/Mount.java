package com.example.storeservice.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Mount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String taming; //tresura

    @NotNull
    private String occurence; //wystepowanie

    @NotNull
    private boolean owned; //posiadany

}

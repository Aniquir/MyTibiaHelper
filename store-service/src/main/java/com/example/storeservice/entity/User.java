package com.example.storeservice.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nick;

    @NotNull
    private String emailAddress;

    @NotNull
    private String password;

//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
//    private Set<GameCharacter> gameCharacters;
//
//    public void addCharacter(GameCharacter gameCharacter){
//        if(this.gameCharacters == null){
//            this.gameCharacters = new HashSet<>(0);
//        }
//
//        gameCharacters.add(gameCharacter);
//    }
}

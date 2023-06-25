package com.rpg.rpgsystem.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
@Entity(name = "ROLE")
public class UserEntity {
    @Id
    @Column(name = "id_user")
    private Integer idUser;

    @Column(name = "email")
    private String userEmail;

    @Column(name = "password")
    private String userPassword;

    @Column(name = "name")
    private String userName;

    public UserEntity() {

    }
}

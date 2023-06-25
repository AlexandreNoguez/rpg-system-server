package com.rpg.rpgsystem.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "roles")
public class RolesEntity {
    @Id
//    @GeneratedValue()
    @Column(name = "id_role")
    private Integer idRole;

    @Column(name = "name")
    private String roleName;

    @Column(name = "description")
    private String roleDescription;
}

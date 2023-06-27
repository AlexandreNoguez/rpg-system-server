package com.rpg.rpgsystem.entities;

import com.rpg.rpgsystem.entities.pk.RoleUser;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Set;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "roles")
public class RoleEntity {
    @Id
//    @GeneratedValue()
    @Column(name = "id_role")
    private Integer idRole;

    @Column(name = "name")
    private String roleName;

    @Column(name = "description")
    private String roleDescription;

    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
    private Set<RoleUser> rolesUsers;
}

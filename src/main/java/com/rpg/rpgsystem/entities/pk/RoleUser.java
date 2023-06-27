package com.rpg.rpgsystem.entities.pk;

import com.rpg.rpgsystem.entities.RoleEntity;
import com.rpg.rpgsystem.entities.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Embeddable
@Entity(name = "roles_users")
public class RoleUser {
    @Id
    @Column(name = "id_user_role")
    private Integer idUserRole;

//    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_role")
    private RoleEntity role;

    //    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private UserEntity user;
}

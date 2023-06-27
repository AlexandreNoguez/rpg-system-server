package com.rpg.rpgsystem.entities.pk;

import com.rpg.rpgsystem.entities.CharacterEntity;
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
@Entity(name = "users_characters")
public class UserCharacter {
    @Id
    @Column(name = "id_user_character")
    private Integer idUserCharacter;

    // @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private UserEntity user;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_character")
    private CharacterEntity character;


}

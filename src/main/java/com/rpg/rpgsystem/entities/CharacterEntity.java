package com.rpg.rpgsystem.entities;

import com.rpg.rpgsystem.entities.pk.CharacterJob;
import com.rpg.rpgsystem.entities.pk.UserCharacter;
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
@Entity(name = "characters")
public class CharacterEntity {
    @Id
    @Column(name = "id_character")
    private Integer idCharacter;

    @Column(name = "name")
    private String characterName;

    @Column(name = "level")
    private Integer characterLevel;

    @Column(name = "hp")
    private Integer characterHealthPoint;

    @Column(name = "mp")
    private Integer characterMagicPoint;

    @Column(name = "attack")
    private Integer characterAttack;

    @Column(name = "defense")
    private Integer characterDefense;

    @Column(name = "race")
    private String race;

    @OneToMany(mappedBy = "character", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<UserCharacter> usersCharacters;

    @OneToMany(mappedBy = "character", fetch = FetchType.LAZY)
    private Set<CharacterJob> charactersJobs;
}

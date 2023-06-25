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
}

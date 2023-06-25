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
@Entity(name = "skills")
public class SkillEntity {
    @Id
    @Column(name = "id_skill")
    private Integer idSkill;

    @Column(name = "name")
    private String skillName;

    @Column(name = "description")
    private String skillDescription;

    @Column(name = "mp_cost")
    private Integer skillCost;
}

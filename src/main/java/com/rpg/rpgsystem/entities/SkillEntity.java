package com.rpg.rpgsystem.entities;

import com.rpg.rpgsystem.entities.pk.JobSkill;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Set;

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

    @OneToMany(mappedBy = "skill")
    private Set<JobSkill> skill;

}

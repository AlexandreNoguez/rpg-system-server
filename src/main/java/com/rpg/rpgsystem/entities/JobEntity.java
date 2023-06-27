package com.rpg.rpgsystem.entities;

import com.rpg.rpgsystem.entities.pk.CharacterJob;
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
@Entity(name = "jobs")
public class JobEntity {
    @Id
    @Column(name = "id_job")
    private Integer idJob;

    @Column(name = "name")
    private String jobName;

    @Column(name = "description")
    private String jobDescription;

    @Column(name = "bonus_attribute")
    private Integer jobBonusAttribute;

    @OneToMany(mappedBy = "job")
    private Set<CharacterJob> charactersJobs;

    @OneToMany(mappedBy = "skill")
    private Set<JobSkill> skill;
}

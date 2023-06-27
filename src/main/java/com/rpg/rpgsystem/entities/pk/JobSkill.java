package com.rpg.rpgsystem.entities.pk;

import com.rpg.rpgsystem.entities.JobEntity;
import com.rpg.rpgsystem.entities.SkillEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "jobs_skills")
public class JobSkill {
    @Id
    @Column(name = "id_job_skill")
    private Integer idJobSkill;

    // @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_job")
    private JobEntity idJob;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_skill")
    private SkillEntity skill;
}

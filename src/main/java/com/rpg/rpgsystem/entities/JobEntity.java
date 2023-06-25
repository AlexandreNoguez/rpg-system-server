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


}

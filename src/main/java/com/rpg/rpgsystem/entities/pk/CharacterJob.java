package com.rpg.rpgsystem.entities.pk;

import com.rpg.rpgsystem.entities.CharacterEntity;
import com.rpg.rpgsystem.entities.JobEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "characters_jobs")
public class CharacterJob {
    @Id
    @Column(name = "id_character_job")
    private Integer idCharacterJob;

    //    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_character")
    private CharacterEntity character;

    //    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_job")
    private JobEntity job;
}

package com.projetx.ineat.test1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "RESUME")
public class Resume {

    private static final String TEXT = "text";
    @Id
    @Column(name = "ID")
    private String id;

    @Column(columnDefinition = TEXT, name = "TEXT_RESUME")
    private String textResume;
}

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
@Table(name = "JOKER")
public class Joker {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "NAME")
    private String name;
    @Column(name = "CRIME")
    private String crime;
}

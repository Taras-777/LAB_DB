package com.example.Lab4.passive.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "supplements")
@EqualsAndHashCode(of = "id")
@ToString
public class SupplementsEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "protein")
    private Integer protein;
    @Column(name = "collagen")
    private Integer collagen;
    @Column(name = "amino_acids")
    private Integer amino_acids;
    @Column(name = "creatine")
    private Integer creatine;
    @Column(name = "bcaa")
    private Integer bcaa;

}


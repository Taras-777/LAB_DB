package com.example.Lab4.passive.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "sportsman")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class SportsmanEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column (name = "full_name", length = 82)
    private String full_name;
    @Column(name = "weight")
    private Integer weight;
    @Column(name = "height")
    private Integer height;
    @Column(name="type_of_sport",length = 45)
    private  String type_of_sport;
    @Column(name = "nutritionist_id")
    private Integer nutritionist_id;

}

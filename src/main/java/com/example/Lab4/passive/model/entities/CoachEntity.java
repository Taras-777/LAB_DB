package com.example.Lab4.passive.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "coach")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class CoachEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "full_name", length = 45)
    private String full_name;
    @Column(name = "reviews")
    private Integer reviews;
    @Column(name = "sportsman_id")
    private Integer sportsman_id;
}

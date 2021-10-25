package com.example.Lab4.passive.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Table(name = "nutritionist")
@ToString
public class NutritionistEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "full_name", length = 80)
    private String full_name;
    @Column(name = "reviews")
    private Integer reviews;
    @Column(name = "diet_id")
    private Integer diet_id;

}

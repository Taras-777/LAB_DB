package com.example.Lab4.passive.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "diet")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class DietTypeEntity {
    @Id
    @Column(name = "id")
    private Integer id ;
    @Column(name = "first_meal_supl_id")
    private Integer first_meal_supl_id;
    @Column(name = "second_meal_supl_id")
    private Integer second;
    @Column(name = "third_meal_supl_id")
    private Integer third_meal_supl_id;
}

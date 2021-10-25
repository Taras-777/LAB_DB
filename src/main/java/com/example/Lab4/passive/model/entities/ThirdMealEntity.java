package com.example.Lab4.passive.model.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "third_meal")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@ToString
public class ThirdMealEntity {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column (name = "name", length = 45)
    private String name;
    @Column (name = "weight")
    private Integer weight;
    @Column (name = "calories")
    private Integer calories;
    @Column(name = "proteins")
    private Integer proteins;
    @Column (name = "fat")
    private Integer fat;
    @Column (name = "carbohydrates")
    private Integer carbohydrates;
}

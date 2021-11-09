package model.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "third_meal")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")


public class ThirdMeal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name", length = 45)
    private String name;
    @Column(name = "weight")
    private Integer weight;
    @Column(name = "calories")
    private Integer calories;
    @Column(name = "proteins")
    private Integer proteins;
    @Column(name = "fat")
    private Integer fat;
    @Column(name = "carbohydrates")
    private Integer carbohydrates;

    @Override
    public String toString(){
        return "ThirdMeal {"
                + "id =" + id + ", "
                + "name = " + name + ", "
                + "weight =" + weight + ", "
                + "calories =" + calories + ", "
                + "proteins =" + proteins + ", "
                + "fat =" + fat + ", "
                + "carbohydrates =" + carbohydrates + ", "
                + "};"  + "\n";
    }
}
package model.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "nutritionist")
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")

public class Nutritionist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "full_name" , length = 80)
    private String full_name;
    @Column(name = "reviews")
    private String  reviews;
    @Column(name = "diet_id")
    private Integer diet_id;



    public Nutritionist(Integer id, String full_name, String reviews, Integer diet_id){
        this.id = id;
        this.full_name = full_name;
        this.reviews = reviews;
        this.diet_id = diet_id;
    }
    @Override
    public String toString(){
        return "Nutritionist {"
                + "id =" + id + ", "
                + "full_name = " + full_name + ", "
                + "reviews = " + reviews + ", "
                + "diet id = " + diet_id + ", "
                + "};"  + "\n";
    }
}

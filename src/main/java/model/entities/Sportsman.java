package model.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Table(name = "sportsman")
@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")

public class Sportsman {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "full_name", length = 82)
    private String full_name;
    @Column(name = "weight")
    private Integer weight;
    @Column(name = "height")
    private Integer height;
    @Column(name = "type_of_sport", length = 45)
    private String type_of_sport;
    @Column(name = "nutritionist_id")
    private Integer nutritionist_id;




    public Sportsman(Integer id,String full_name, Integer weight, Integer height,String type_of_sport, Integer nutritionist_id) {
        this.id = id;
        this.full_name = full_name;
        this.weight = weight;
        this.height = height;
        this.type_of_sport = type_of_sport;
        this.nutritionist_id = nutritionist_id;
    }


    @Override
    public String toString(){
        return "Sportsman {"
                + "id =" + id + ", "
                + "name = " + full_name + ", "
                + "weight = " + weight + ", "
                + "height = " + height + ", "
                + "type of sport = " + type_of_sport + ", "
                + "nutritionist id = " + nutritionist_id + ", "
                + "};"  + "\n";
    }
}
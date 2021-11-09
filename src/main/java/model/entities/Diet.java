package model.entities;


import lombok.*;
import org.springframework.data.relational.core.sql.In;

import javax.persistence.*;
import java.util.Collection;

@Table(name = "diet")
@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")

public class Diet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "first_meal_supl_id")
    private Integer first_meal_supl_id;
    @Column(name = "second_meal_supl_id")
    private Integer second_meal_supl_id;
    @Column(name = "third_meal_supl_id")
    private Integer third_meal_supl_id;

    public Diet(Integer id, Integer first_meal_supl_id, Integer second_meal_supl_id, Integer third_meal_supl_id){
        this.id = id;
        this.first_meal_supl_id = first_meal_supl_id;
        this.second_meal_supl_id = second_meal_supl_id;
        this.third_meal_supl_id = third_meal_supl_id;
    }

    @Override
    public String toString(){
        return "Diet {"
                + "id =" + id + ", "
                + "first meal supplements id = " + first_meal_supl_id + ", "
                + "second meal supplements id = " + second_meal_supl_id + ", "
                + "third meal supplements id = " + third_meal_supl_id
                + "};"  + "\n";
    }
}

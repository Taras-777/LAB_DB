package model.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "coach")
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")

public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "full_name", length = 45)
    private String full_name;
    @Column(name = "reviews")
    private Integer reviews;
    @Column(name = "sportsman_id")
    private Integer sportsman_id;

    public Coach(Integer id, String full_name, Integer reviews, Integer sportsman_id){
        this.id = id;
        this.full_name = full_name;
        this.reviews = reviews;
        this.sportsman_id = sportsman_id;
    }

    @Override
    public String toString(){
        return "Coach {"
                + "id =" + id + ", "
                + "full name = " + full_name + ", "
                + "reviews = " + reviews + ", "
                + "sportsman id =" + sportsman_id + ", "
                + "};"  + "\n";
    }

}

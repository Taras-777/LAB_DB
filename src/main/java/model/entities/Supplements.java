package model.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "supplements")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")

public class Supplements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column (name = "protein")
    private Integer collagen;
    @Column (name = "collagen")
    private Integer protein;
    @Column (name = "amino_acids")
    private Integer amino_acids;
    @Column (name = "creatine")
    private Integer creatine;
    @Column (name = "bcaa")
    private Integer bcaa;

    @Override
    public String toString(){
        return "Supplements {"
                + "id =" + id + ", "
                + "protein = " + protein
                + "collagen = " + collagen
                + "amino acids = " + amino_acids
                + "creatine = " + creatine
                + "bcaa = " + bcaa
                + "};"  + "\n";
    }
}

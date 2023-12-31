package entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "planets")
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "planets")
    private String planetName;
}

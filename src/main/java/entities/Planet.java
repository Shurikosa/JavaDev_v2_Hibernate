package entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "planets")
public class Planet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 50, unique = true, nullable = false)
    private String id;

    @Column(name = "planets",length = 500,nullable = false)
    private String planet;


}

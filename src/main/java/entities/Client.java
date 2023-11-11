package entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "name",length = 200,nullable = false)
    private String name;
    @OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
    private List<Ticket> tickets;
}

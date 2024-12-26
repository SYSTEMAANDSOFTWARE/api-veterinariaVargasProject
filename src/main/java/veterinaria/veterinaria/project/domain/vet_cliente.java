package veterinaria.veterinaria.project.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "cliente")
public class vet_cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}

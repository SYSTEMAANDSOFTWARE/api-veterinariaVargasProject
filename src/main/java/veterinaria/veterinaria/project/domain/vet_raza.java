package veterinaria.veterinaria.project.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "raza_mascota")
public class vet_raza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}

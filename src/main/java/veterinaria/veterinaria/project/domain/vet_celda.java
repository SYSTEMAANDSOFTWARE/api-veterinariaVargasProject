package veterinaria.veterinaria.project.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "celda_mascota")
public class vet_celda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}

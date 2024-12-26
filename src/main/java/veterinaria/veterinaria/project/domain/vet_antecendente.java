package veterinaria.veterinaria.project.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "antecedentes_mascota")
public class vet_antecendente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
}

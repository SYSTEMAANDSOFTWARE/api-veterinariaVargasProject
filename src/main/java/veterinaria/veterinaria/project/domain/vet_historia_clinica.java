package veterinaria.veterinaria.project.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "historia_clinica")
public class vet_historia_clinica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}

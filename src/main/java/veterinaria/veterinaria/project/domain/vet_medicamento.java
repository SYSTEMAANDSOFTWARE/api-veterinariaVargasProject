package veterinaria.veterinaria.project.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "medicamento")
public class vet_medicamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}

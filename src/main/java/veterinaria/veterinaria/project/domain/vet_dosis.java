package veterinaria.veterinaria.project.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "dosis")
public class vet_dosis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}

package veterinaria.veterinaria.project.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "patologia")
public class vet_patologia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}

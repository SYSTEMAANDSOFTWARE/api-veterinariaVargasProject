package veterinaria.veterinaria.project.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "role")
public class vet_rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}

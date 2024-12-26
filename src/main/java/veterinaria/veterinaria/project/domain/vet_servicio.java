package veterinaria.veterinaria.project.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "servicio")
public class vet_servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}

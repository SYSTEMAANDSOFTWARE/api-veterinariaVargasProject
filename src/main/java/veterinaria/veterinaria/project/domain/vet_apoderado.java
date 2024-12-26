package veterinaria.veterinaria.project.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="apoderado_mascota")
public class vet_apoderado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}

package veterinaria.veterinaria.project.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "pago")
public class vet_pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}

package veterinaria.veterinaria.project.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "medico_veterinario")
public class vet_medicoVeterinario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}

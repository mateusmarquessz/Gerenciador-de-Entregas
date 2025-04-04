package mateusmarquessz.Gerenciador_de_Entregas.Entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "foto_entrega")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class FotoEntrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;
    private LocalDateTime dataHora;

    @ManyToOne
    @JoinColumn(name = "entrega_id")
    private Entrega entrega;
}
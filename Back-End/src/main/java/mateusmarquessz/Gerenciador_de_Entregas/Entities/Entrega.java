package mateusmarquessz.Gerenciador_de_Entregas.Entities;

import jakarta.persistence.*;
import lombok.*;
import mateusmarquessz.Gerenciador_de_Entregas.Enum.StatusEntrega;

import java.time.LocalDateTime;

@Entity
@Table(name = "entregas")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Entrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private String endereco;

    @Enumerated(EnumType.STRING)
    private StatusEntrega status;

    private LocalDateTime dataCriacao;

    @ManyToOne
    @JoinColumn(name = "criador_id")
    private Usuario criador;

    @ManyToOne
    @JoinColumn(name = "entregador_id")
    private Usuario entregador;
}

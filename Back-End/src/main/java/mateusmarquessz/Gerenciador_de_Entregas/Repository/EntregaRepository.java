package mateusmarquessz.Gerenciador_de_Entregas.Repository;

import mateusmarquessz.Gerenciador_de_Entregas.Entities.Entrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntregaRepository extends JpaRepository<Entrega, Long> {
}

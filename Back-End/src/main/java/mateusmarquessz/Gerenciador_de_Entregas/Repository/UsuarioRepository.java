package mateusmarquessz.Gerenciador_de_Entregas.Repository;

import mateusmarquessz.Gerenciador_de_Entregas.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
}
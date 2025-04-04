package mateusmarquessz.Gerenciador_de_Entregas.Service;

import mateusmarquessz.Gerenciador_de_Entregas.Entities.Entrega;
import mateusmarquessz.Gerenciador_de_Entregas.Repository.EntregaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EntregaService {

    @Autowired
    private EntregaRepository entregaRepository;


    public List<Entrega> listarTodas() {
        return entregaRepository.findAll();
    }

    public Optional<Entrega> buscarPorId(Long id) {
        return entregaRepository.findById(id);
    }

    public Entrega salvar(Entrega entrega) {
        return entregaRepository.save(entrega);
    }
}

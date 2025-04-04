package mateusmarquessz.Gerenciador_de_Entregas.Controller;

import mateusmarquessz.Gerenciador_de_Entregas.Entities.Entrega;
import mateusmarquessz.Gerenciador_de_Entregas.Service.EntregaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/entregas")
public class EntregaController {

    @Autowired
    private EntregaService entregaService;

    @GetMapping
    public List<Entrega> listarTodas() {
        return entregaService.listarTodas();
    }

    @GetMapping("/{id}")
    public Optional<Entrega> buscarPorId(@PathVariable Long id) {
        return entregaService.buscarPorId(id);
    }

    @PostMapping
    public Entrega criarEntrega(@RequestBody Entrega entrega) {
        return entregaService.salvar(entrega);
    }
}

package spring.estudos.Cadastro.Estudantes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteRepository repository;



    @GetMapping
    public List<EstudanteModel> listar() {
        return repository.findAll();
    }
}
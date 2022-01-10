package br.com.verzel.apicarros.controllers;

import br.com.verzel.apicarros.entities.Carro;
import br.com.verzel.apicarros.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/carros")
public class CarroController {

    @Autowired
    private CarroService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Carro cadastrarCarro(@RequestBody @Valid Carro carro) {
        return service.salvar(carro);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarCarro(@PathVariable Long id){
        service.deletar(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Carro> listarTodosOsCarros() {
        return service.listarCarros();
    }

}

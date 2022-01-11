package br.com.verzel.apicarros.services.impl;

import br.com.verzel.apicarros.entities.Carro;
import br.com.verzel.apicarros.repositories.CarroRepository;
import br.com.verzel.apicarros.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service
public class CarroServiceImpl implements CarroService {

    @Autowired
    private CarroRepository repository;

    @Override
    public Carro salvar(Carro carro) {
        return repository.save(carro);
    }

    @Override
    public void deletar(Long id) {
        repository
                .findById(id)
                .map( carro -> {
                    repository.delete(carro);
                    return Void.TYPE;
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "O recurso que você esta tentando deletar não existe: Carro não encontrado!"));
    }

    @Override
    public List<Carro> listarCarros() {return repository.listarTodosCarrosPorValorDesc();}

    @Override
    public Page<Carro> listarPorPaginas(Integer pagina, Integer tamanhoPagina) {
        return null;
    }

    @Override
    public void atualizar(Long id, Carro carroAtualizado) {
        repository
                .findById(id)
                .map( carro -> {
                    carro.setNome(carroAtualizado.getNome());
                    carro.setMarca(carroAtualizado.getMarca());
                    carro.setModelo(carroAtualizado.getModelo());
                    return repository.save(carro);
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "O recurso que você esta tentando atualizar não existe: Carro não encontrado!"));
    }
}

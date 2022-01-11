package br.com.verzel.apicarros.services;

import br.com.verzel.apicarros.entities.Carro;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CarroService {

    Carro salvar(Carro carro);

    void deletar(Long id);

    List<Carro> listarCarros();

    Page<Carro> listarPorPaginas(Integer pagina, Integer tamanhoPagina);

    void atualizar(Long id, Carro carroAtualizado);
}

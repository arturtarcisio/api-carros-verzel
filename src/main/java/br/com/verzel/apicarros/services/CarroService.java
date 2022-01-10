package br.com.verzel.apicarros.services;

import br.com.verzel.apicarros.entities.Carro;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CarroService {

    public Carro salvar(Carro carro);

    public void deletar(Long id);

    public List<Carro> listarCarros();

    public Page<Carro> listarPorPaginas(Integer pagina, Integer tamanhoPagina);

    public Carro update(Long id, Carro carro);
}

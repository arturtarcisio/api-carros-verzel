package br.com.verzel.apicarros.repositories;

import br.com.verzel.apicarros.entities.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarroRepository extends JpaRepository<Carro, Long> {

    @Query("SELECT c FROM Carro c ORDER BY c.valor DESC")
    List<Carro> listarTodosCarrosPorValorDesc();

}

package br.com.verzel.apicarros.repositories;

import br.com.verzel.apicarros.entities.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {
}

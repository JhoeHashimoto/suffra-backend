package br.com.fiap.suffra.repository;

import br.com.fiap.suffra.entity.Voto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VotoRepository extends JpaRepository<Voto, Long> {
}
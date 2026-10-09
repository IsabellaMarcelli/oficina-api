package br.edu.ifsp.pw3.api.conserto;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsertoRepository extends JpaRepository<Conserto, Long> {

    // O Spring Data cria a consulta a partir do nome do método:
    // busca apenas os consertos com ativo = true
    List<Conserto> findAllByAtivoTrue();

}

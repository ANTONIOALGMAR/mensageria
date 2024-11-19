package br.com.antonio.validador_boleto.repository;

import br.com.antonio.validador_boleto.entity.BoletoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface boletoRepository extends CrudRepository<BoletoEntity, Long> {
}

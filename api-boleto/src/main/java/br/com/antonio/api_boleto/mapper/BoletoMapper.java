package br.com.antonio.api_boleto.mapper;

import br.com.antonio.api_boleto.dto.BoletoDTO;
import br.com.antonio.api_boleto.entity.BoletoEntity;

public class BoletoMapper {

    public static BoletoDTO toDTO(BoletoEntity boleto){
        return BoletoDTO.builder()
                .codigoBarras(boleto.getCodigoBarras())
                .situacaoBoleto(boleto.getSituacaoBoleto())
                .dataCriacao(boleto.getDataCriacao())
                .dataAtualizacao(boleto.getDataAtualizacao())
                .build();
    }
}

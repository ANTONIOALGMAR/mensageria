package br.com.antonio.api_boleto.dto;

import br.com.antonio.api_boleto.entity.enums.SituacaoBoleto;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoletoDTO {

    private String codigoBarras;


    private SituacaoBoleto situacaoBoleto;


    private LocalDateTime dataCriacao;

    private LocalDateTime dataAtualizacao;
}

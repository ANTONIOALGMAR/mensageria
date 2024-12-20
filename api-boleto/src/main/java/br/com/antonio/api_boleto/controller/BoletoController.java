package br.com.antonio.api_boleto.controller;

import br.com.antonio.api_boleto.dto.BoletoDTO;
import br.com.antonio.api_boleto.dto.BoletoRequestDTO;
import br.com.antonio.api_boleto.service.BoletoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/boleto")
public class BoletoController {

    private final BoletoService boletoService;

    public BoletoController(BoletoService boletoService) {
        this.boletoService = boletoService;
    }

    public ResponseEntity<BoletoDTO> salvar(@RequestBody BoletoRequestDTO boletoRequestDTO){
        var boleto = boletoService.salvar(boletoRequestDTO.getCodigoBarras());
        return new ResponseEntity<>(boleto, HttpStatus.CREATED);
    }
}

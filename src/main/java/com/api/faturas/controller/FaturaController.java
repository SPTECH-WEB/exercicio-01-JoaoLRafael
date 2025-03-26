package com.api.faturas.controller;

import com.api.faturas.model.Fatura;
import com.api.faturas.service.FaturaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/faturas")
public class FaturaController {
    private final FaturaService faturaService;

    public FaturaController(FaturaService faturaService) {
        this.faturaService = faturaService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Fatura>> listarFaturas() {
        return ResponseEntity.ok(faturaService.listarFaturas());
    }

    @PostMapping
    public ResponseEntity<Fatura> cadastrarFatura(@Valid @RequestBody Fatura fatura) {
        Fatura novaFatura = faturaService.cadastrarFatura(fatura);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaFatura);
    }
}

package com.energiainteligente.controller;

import com.energiainteligente.model.EnergiaStatusDTO;
import com.energiainteligente.service.EnergiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/energia")
public class EnergiaController {

    @Autowired
    private EnergiaService energiaService;

    @GetMapping("/status")
    public ResponseEntity<EnergiaStatusDTO> getStatusEnergia() {
        return ResponseEntity.ok(energiaService.obterStatusAtual());
    }

    @PostMapping("/acionar/emergencia")
    public ResponseEntity<String> acionarBackup() {
        energiaService.acionarBackup();
        return ResponseEntity.ok("Backup de energia com hidrogênio ativado.");
    }
}

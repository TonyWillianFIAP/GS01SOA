package com.energiainteligente.service;

import com.energiainteligente.model.EnergiaStatusDTO;
import org.springframework.stereotype.Service;

@Service
public class EnergiaService {

    public EnergiaStatusDTO obterStatusAtual() {
        EnergiaStatusDTO dto = new EnergiaStatusDTO();
        dto.setStatusRede("Indisponível");
        dto.setNivelHidrogenio("82%");
        dto.setBackupAtivo(false);
        return dto;
    }

    public void acionarBackup() {
        System.out.println("Acionando backup com célula a combustível...");
    }
}

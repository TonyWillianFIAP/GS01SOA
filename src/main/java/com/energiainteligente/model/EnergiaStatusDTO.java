package com.energiainteligente.model;

public class EnergiaStatusDTO {
    private String statusRede;
    private String nivelHidrogenio;
    private boolean backupAtivo;

    public String getStatusRede() { return statusRede; }
    public void setStatusRede(String statusRede) { this.statusRede = statusRede; }

    public String getNivelHidrogenio() { return nivelHidrogenio; }
    public void setNivelHidrogenio(String nivelHidrogenio) { this.nivelHidrogenio = nivelHidrogenio; }

    public boolean isBackupAtivo() { return backupAtivo; }
    public void setBackupAtivo(boolean backupAtivo) { this.backupAtivo = backupAtivo; }
}

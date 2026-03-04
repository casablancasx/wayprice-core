package com.dnilochaves.wayprice_core.domain.model;

public enum Role {
    ADMIN("Admin"),
    USER("User");

    private final String descricao;

    Role (String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

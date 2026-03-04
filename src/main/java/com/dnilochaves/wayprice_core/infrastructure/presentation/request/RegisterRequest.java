package com.dnilochaves.wayprice_core.infrastructure.presentation.request;

public record RegisterRequest(String nome, String email, String telefone, String cpf, String password, String confirmPassword) {
}


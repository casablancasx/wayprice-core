package com.dnilochaves.wayprice_core.domain.model;

import com.dnilochaves.wayprice_core.domain.exception.UserValidationException;

import java.util.List;
import java.util.UUID;

public record UserModel(UUID id, String cpf, String nome, String email, String password, String telefone, List<Role> roles) {

    public UserModel(String cpf, String nome, String email, String password, String telefone, List<Role> roles) {
        this(null, cpf, nome, email, password, telefone, roles);
    }

    public void validate() {
        if (cpf == null || cpf.isEmpty())
            throw new UserValidationException("CPF é obrigatório");
        if (nome == null || nome.isEmpty())
            throw new UserValidationException("Nome é obrigatório");
        if (email == null || email.isEmpty())
            throw new UserValidationException("Email é obrigatório");
        if (telefone == null || telefone.isEmpty())
            throw new UserValidationException("Telefone é obrigatório");
        if (password == null || password.isEmpty())
            throw new UserValidationException("Senha é obrigatória");
    }
}

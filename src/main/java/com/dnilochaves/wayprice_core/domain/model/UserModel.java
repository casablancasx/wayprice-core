package com.dnilochaves.wayprice_core.domain.model;

import java.util.List;

public record UserModel(String nome,String email, String password,  String telefone, String cpf, List<Role> roles) {
}

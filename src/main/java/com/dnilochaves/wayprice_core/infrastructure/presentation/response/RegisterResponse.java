package com.dnilochaves.wayprice_core.infrastructure.presentation.response;

import java.util.UUID;

/**
 * Resposta da aplicação ao realizar cadastro
 * com sucesso.
 */
public record RegisterResponse(
        UUID id,
        String nome,
        String email,
        String telefone
) {
}


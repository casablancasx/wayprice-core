package com.dnilochaves.wayprice_core.infrastructure.presentation.response;

/**
 * Resposta da aplicação ao realizar login
 * com sucesso.
 */
public record LoginResponse(
        String token,
        Long timestamp,
        Long expiration
) {
}


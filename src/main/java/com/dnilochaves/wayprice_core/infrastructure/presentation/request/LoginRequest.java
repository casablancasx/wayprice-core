package com.dnilochaves.wayprice_core.infrastructure.presentation.request;

/**
 * Login request payload.
 * DTO para realizar login na aplicação
 */
public record LoginRequest(String email, String password) {
}


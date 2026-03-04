package com.dnilochaves.wayprice_core.domain.dto.response;

public record LoginResponse(
        String token,
        Long timestamp,
        Long expiration
) {
}

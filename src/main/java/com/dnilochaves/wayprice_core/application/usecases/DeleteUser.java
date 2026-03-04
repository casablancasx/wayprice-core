package com.dnilochaves.wayprice_core.application.usecases;

import com.dnilochaves.wayprice_core.application.gateways.UserGateway;

import java.util.UUID;

public class DeleteUser {

    private final UserGateway userGateway;

    public DeleteUser(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public void execute(UUID id) {
        userGateway.delete(id);
    }
}

package com.dnilochaves.wayprice_core.application.usecases;

import com.dnilochaves.wayprice_core.application.gateways.UserGateway;
import com.dnilochaves.wayprice_core.domain.model.UserModel;

public class UpdateUser {

    private final UserGateway userGateway;

    public UpdateUser(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public UserModel execute(UserModel user) {
        return userGateway.update(user);
    }
}

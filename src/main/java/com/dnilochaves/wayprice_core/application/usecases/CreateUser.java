package com.dnilochaves.wayprice_core.application.usecases;

import com.dnilochaves.wayprice_core.application.gateways.UserGateway;
import com.dnilochaves.wayprice_core.domain.model.UserModel;

public class CreateUser {

    private final UserGateway userGateway;

    public CreateUser(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public UserModel execute(UserModel user) {
        user.validate();
        return userGateway.create(user);
    }
}

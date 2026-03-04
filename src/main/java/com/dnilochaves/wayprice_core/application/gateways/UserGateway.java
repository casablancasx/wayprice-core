package com.dnilochaves.wayprice_core.application.gateways;

import com.dnilochaves.wayprice_core.domain.model.UserModel;

import java.util.UUID;

public interface UserGateway {

    UserModel create(UserModel user);

    UserModel update(UserModel user);

    void delete(UUID id);
}

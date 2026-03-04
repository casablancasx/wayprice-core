package com.dnilochaves.wayprice_core.application.services;

import com.dnilochaves.wayprice_core.application.usecases.CreateUser;
import com.dnilochaves.wayprice_core.application.usecases.DeleteUser;
import com.dnilochaves.wayprice_core.application.usecases.UpdateUser;
import com.dnilochaves.wayprice_core.domain.model.UserModel;

import java.util.UUID;

public class UserService {

    private final CreateUser createUser;
    private final DeleteUser deleteUser;
    private final UpdateUser updateUser;

    public UserService(CreateUser createUser, DeleteUser deleteUser, UpdateUser updateUser) {
        this.createUser = createUser;
        this.deleteUser = deleteUser;
        this.updateUser = updateUser;
    }

    public UserModel create(UserModel user) {
        return createUser.execute(user);
    }

    public UserModel update(UserModel user) {
        return updateUser.execute(user);
    }

    public void delete(UUID id) {
        deleteUser.execute(id);
    }
}

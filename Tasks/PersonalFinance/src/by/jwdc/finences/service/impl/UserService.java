package by.jwdc.finences.service.impl;

import by.jwdc.finences.bean.User;
import by.jwdc.finences.service.IUserService;

public class UserService implements IUserService {

    private User currentUser;

    @Override
    public User getCurrentUser() {
        return currentUser;
    }

    @Override
    public boolean loginUser(String login, String password) {

        boolean res = false;


        return res;
    }
}

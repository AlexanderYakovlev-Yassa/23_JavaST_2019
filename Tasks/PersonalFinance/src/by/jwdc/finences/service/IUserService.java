package by.jwdc.finences.service;

import by.jwdc.finences.bean.User;

public interface IUserService {

    User getCurrentUser();

    boolean loginUser(String login, String password);
}

package by.jwdc.finences.dao;

import by.jwdc.finences.bean.User;
import by.jwdc.finences.dao.exception.DaoFactoryException;
import by.jwdc.finences.enumerator.UserStatus;

public interface IUserFactoryDao {

    User createUser(String login, String firstName, String LastName, UserStatus status) throws DaoFactoryException;
}

package by.jwdc.finences.dao.factory;

import by.jwdc.finences.bean.User;
import by.jwdc.finences.dao.exception.DaoFactoryException;
import by.jwdc.finences.enumerator.UserStatus;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryDAOTest {

    @Test(expected = DaoFactoryException.class)
    public void createUser() throws DaoFactoryException {

        String login = "4Alex";
        String firstName = "Alexander";
        String lastName = "Yakovlev";
        UserStatus status = UserStatus.ADMIN;

        UserFactoryDAO factory = new UserFactoryDAO();

        boolean actual = factory.createUser(login, firstName, lastName, status) != null;
    }
}
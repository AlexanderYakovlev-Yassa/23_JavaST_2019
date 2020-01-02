package by.jwdc.finences.dao;

import by.jwdc.finences.bean.User;
import by.jwdc.finences.dao.exception.FileOperationDAOException;

public interface IOperationDAO {
    User findUser(String login) throws FileOperationDAOException;
}

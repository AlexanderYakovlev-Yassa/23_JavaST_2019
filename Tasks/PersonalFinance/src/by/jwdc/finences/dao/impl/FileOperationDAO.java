package by.jwdc.finences.dao.impl;

import by.jwdc.finences.bean.User;
import by.jwdc.finences.dao.IOperationDAO;
import by.jwdc.finences.dao.exception.DaoUtilException;
import by.jwdc.finences.dao.exception.FileOperationDAOException;
import by.jwdc.finences.dao.exception.FileUserDAOException;
import by.jwdc.finences.dao.util.FileUtil;

import java.io.File;
import java.util.ArrayList;

public class FileOperationDAO implements IOperationDAO {

    private static final File usersFile = new File("src\\by\\jwdc\\finences\\dao\\db\\Users.dat");
    private static final File financeMovementFile = new File("src\\by\\jwdc\\finences\\dao\\db\\Finance_movement.dat");
    private static final File operationTypesFile = new File("src\\by\\jwdc\\finences\\dao\\db\\Operation_types.dat");
    private static final File passwordFile = new File("src\\by\\jwdc\\finences\\dao\\db\\Password.dat");


    @Override
    public User findUser(String login) throws FileOperationDAOException {

        ArrayList<String> allUsers = null;

        try {
            allUsers = FileUtil.readFile(usersFile);
        } catch (DaoUtilException e) {
            throw new FileOperationDAOException("Data sours is broken", e);
        }

        return null;
    }
}

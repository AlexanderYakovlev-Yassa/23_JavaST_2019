package by.jwdc.finences.dao.factory;

import by.jwdc.finences.bean.User;
import by.jwdc.finences.dao.IUserFactoryDao;
import by.jwdc.finences.dao.exception.DaoFactoryException;
import by.jwdc.finences.enumerator.UserStatus;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserFactoryDAO implements IUserFactoryDao {

    @Override
    public User createUser(String login, String firstName, String lastName, UserStatus status) throws DaoFactoryException {

        if (!isNameCorrect(login)){
            throw new DaoFactoryException("Incorrect login");
        }
        if (!isNameCorrect(firstName)){
            throw new DaoFactoryException("Incorrect first name");
        }
        if (!isNameCorrect(lastName)){
            throw new DaoFactoryException("Incorrect last name");
        }
        if (status == null){
            throw new DaoFactoryException("Status can't be null");
        }

        User user = new User(login, firstName, lastName, status);

        return user;
    }

    private static boolean isNameCorrect(String name){

        Pattern p = Pattern.compile("[\\p{javaUpperCase}][\\p{javaAlphabetic}]*");
        Matcher m = p.matcher(name);

        return m.matches();
    }

    public static void main(String[] args) {
        boolean res = isNameCorrect("Александр ");
        System.out.println(res);
    }
}

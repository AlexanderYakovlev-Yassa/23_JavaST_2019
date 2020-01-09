package by.jwdc.finances.main;

import by.jwdc.finances.dao.IFinanceOperationDAO;
import by.jwdc.finances.dao.exception.DaoUtilException;
import by.jwdc.finances.dao.factory.DAOFactory;
import by.jwdc.finances.dao.util.FileUtil;

import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        DAOFactory daoFactory = DAOFactory.getInstance();
        IFinanceOperationDAO financeOperationDAO = daoFactory.getOperationDAO();

        File file = new File("src\\by\\jwdc\\finances\\data\\file\\Finance_movement.dat");
        File file1 = new File("src\\by\\jwdc\\finances\\data\\file\\Finance_movement1.dat");

        ArrayList<String> a = new ArrayList<String>();
        try {
            a = FileUtil.readFile(file);
        } catch (DaoUtilException e) {
            e.printStackTrace();
        }

        a.add("202001061930 entertainment expenses 19.00");

        //FileUtil.rewriteFile(file1, a);
    }
}

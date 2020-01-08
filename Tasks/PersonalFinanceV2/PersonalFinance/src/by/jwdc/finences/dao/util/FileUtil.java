package by.jwdc.finences.dao.util;

import by.jwdc.finences.bean.Operation;
import by.jwdc.finences.dao.exception.DaoUtilException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileUtil {

    public final static FileUtil instance = new FileUtil();

    private FileUtil(){};

    public static ArrayList<String> readFile(File file) throws DaoUtilException {

        final String commentSign = "//";

        ArrayList<String> fileContentByRows = new ArrayList<String>();

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String tmp = "";
            while ((tmp = br.readLine()) != null) {
                if (!(tmp.substring(0, 2).equals(commentSign))) {
                    fileContentByRows.add(tmp);
                }
            }
        } catch (IOException e) {
            throw new DaoUtilException("File not found", e);
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    throw new DaoUtilException("Can't close reader", e);
                }
            }
        }

        return fileContentByRows;
    }


}

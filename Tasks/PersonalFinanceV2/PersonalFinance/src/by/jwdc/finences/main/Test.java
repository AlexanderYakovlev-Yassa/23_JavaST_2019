package by.jwdc.finences.main;

import by.jwdc.finences.dao.exception.DaoUtilException;
import by.jwdc.finences.dao.util.FileUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args){

        File file = new File("src\\by\\jwdc\\finences\\dao\\db\\Users.dat");
        System.out.println(file.getAbsolutePath());
        try {
            ArrayList<String> list = FileUtil.readFile(file);
        } catch (DaoUtilException e) {
            System.out.println(e.getMessage());
        }

    }


}

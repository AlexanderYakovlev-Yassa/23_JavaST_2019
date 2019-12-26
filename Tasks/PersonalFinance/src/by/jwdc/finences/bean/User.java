package by.jwdc.finences.bean;

import by.jwdc.finences.enumerator.UserStatus;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
    private UserStatus status;
    private String Login;
    private int PasswordHashCode;
}

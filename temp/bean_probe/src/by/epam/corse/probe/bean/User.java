package by.epam.corse.probe.bean;

import java.io.Serializable;

public class User implements Serializable {

    private String firstName;
    private String lastName;
    private String login;
    private int passwordHashCode;

    public User(String firstName, String lastName, String login, int passwordHashCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.passwordHashCode = passwordHashCode;
    }

    public User() {
        this.firstName = "";
        this.lastName = "";
        this.login = "";
        this.passwordHashCode = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPasswordHashCode() {
        return passwordHashCode;
    }

    public void setPasswordHashCode(int passwordHashCode) {
        this.passwordHashCode = passwordHashCode;
    }

    @Override
    public boolean equals(Object o){

        if (o == null){
            return  false;
        }
        if (this == o){
            return true;
        }
        if (this.getClass() != o.getClass()){
            return false;
        }
        User user = (User)o;

        return this.firstName.equals(user.getFirstName()) &&
        this.lastName.equals(user.getLastName()) &&
        this.login.equals(user.getLogin()) &&
        this.getPasswordHashCode() == user.getPasswordHashCode();
    }

    @Override
    public int hashCode() {
        int res = 7;
        final int a = 31;
        res = res * a + firstName == null ? 0 : firstName.hashCode();
        res = res * a + lastName == null ? 0 : lastName.hashCode();
        res = res * a + login == null ? 0 : login.hashCode();
        res = res * a + passwordHashCode;

        return res;
    }
}

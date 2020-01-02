package by.jwdc.finences.bean;

import by.jwdc.finences.enumerator.UserStatus;

import java.io.Serializable;

public class User implements Serializable {

    private String login;
    private String firstName;
    private String lastName;
    private UserStatus status;

    public User(String login, String firstName, String lastName, UserStatus status) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj){

        if (obj == null){
            return  false;
        }

        if (this == obj){
            return true;
        }

        if(User.class != obj.getClass()){
            return false;
        }

        User user = (User)obj;

        return this.firstName.equals(user.firstName) &&
                this.lastName.equals(user.lastName) &&
                this.login.equals(user.login) &&
                this.status == user.status;
    }

    @Override
    public int hashCode(){

        int res = 7;
        int prime = 31;

        res = res * 31 + (this.firstName == null ? 0 : this.firstName.hashCode());
        res = res * 31 + (this.lastName == null ? 0 : this.lastName.hashCode());
        res = res * 31 + (this.login == null ? 0 : this.login.hashCode());
        res = res * 31 + (this.status == null ? 0 : this.status.ordinal());

        return res;
    }

    @Override
    public String toString(){
        return this.getClass() + " login=" + this.login +
                " firstName=" + this.firstName +
                " lastName=" + this.lastName +
                " status=" + this.status.toString();
    }
}

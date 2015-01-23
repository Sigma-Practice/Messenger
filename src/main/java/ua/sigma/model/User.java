package ua.sigma.model;

import org.hibernate.annotations.AccessType;

import javax.persistence.*;

import static javax.persistence.AccessType.*;
import static javax.persistence.GenerationType.*;

/**
 * Created by vlad on 23.01.15.
 */
@Entity @Access(FIELD)
public class User {
    @GeneratedValue(strategy = IDENTITY)
    @Id int id;
    String login;
    String email;
    int password;
    String fullname;
    String phone;
    String info;
    boolean isAdmin;
    boolean isActivated;


    public User(String login, String email, int password, String fullname, String phone, String info, boolean isAdmin, boolean isActivated) {
        this.login = login;
        this.email = email;
        this.password = password;
        this.fullname = fullname;
        this.phone = phone;
        this.info = info;
        this.isAdmin = isAdmin;
        this.isActivated = isActivated;
    }

    public User() {

    }
}

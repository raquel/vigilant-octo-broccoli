package com.concretesolutions.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.id.UUIDGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created by raquel on 8/26/16.
 */

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "user_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "token")
    private String token;

    @Column(name = "created")
    private Date created;

    @Column(name = "modified")
    private Date modified;

    @Column(name = "last_login")
    private Date last_login;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Phone> phones;

    public User(){}
    
    public User(String name, String email, String password, String token, Date created, Date modified, Date last_login, List<Phone> phones) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.token = token;
        this.created = created;
        this.modified = modified;
        this.last_login = last_login;
        this.phones = phones;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getToken() {
        return token;
    }

    public Date getCreated() {
        return created;
    }

    public Date getModified() {
        return modified;
    }

    public Date getLast_login() {
        return last_login;
    }

    public List<Phone> getPhones() {
        return phones;
    }
}

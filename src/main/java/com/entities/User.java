package com.entities;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "USER_NAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {

    }
}
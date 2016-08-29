package com.concretesolutions.vo;

import java.util.List;

public class RegisterUserRequest {

    private final String name;
    private final String email;
    private final String password;
    private final List<RegisterPhoneRequest> phones;

    public RegisterUserRequest(String name, String email, String password, List<RegisterPhoneRequest> phones) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phones = phones;
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

    public List<RegisterPhoneRequest> getPhones() {
        return phones;
    }
}

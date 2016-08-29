package com.concretesolutions.vo;

public class RegisterPhoneRequest {

    private final Long number;
    private final Long ddd;

    public RegisterPhoneRequest(Long number, Long ddd) {
        this.number = number;
        this.ddd = ddd;
    }

    public Long getNumber() {
        return number;
    }

    public Long getDdd() {
        return ddd;
    }
}

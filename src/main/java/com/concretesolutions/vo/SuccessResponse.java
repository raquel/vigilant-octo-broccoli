package com.concretesolutions.vo;

import java.util.Date;

//TODO Remove inline comments
public class SuccessResponse extends Response {

    private final String id; //UUID do banco
    private final Date created; //Data da criação do usuário
    private final Date modified; //Data ultima atualização
    private final Date last_login; //Data do ultimo login - no cadastro repete o created
    private final String token; //token de acesso da API (pode ser um UUID ou um JWT)

    public SuccessResponse(String id, Date created, Date modified, Date last_login, String token) {
        this.id = id;
        this.created = created;
        this.modified = modified;
        this.last_login = last_login;
        this.token = token;
    }

    public String getId() {
        return id;
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

    public String getToken() {
        return token;
    }
}

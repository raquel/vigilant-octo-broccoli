package com.concretesolutions.service;

import com.concretesolutions.model.User;
import com.concretesolutions.repository.LoginRepository;
import com.concretesolutions.util.Encryption;
import com.concretesolutions.vo.ErrorResponse;
import com.concretesolutions.vo.LoginRequest;
import com.concretesolutions.vo.Response;
import com.concretesolutions.vo.SuccessResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepository repository;

    @Autowired
    private Encryption encryption;

    public Response authenticate(LoginRequest login) {
        User user = repository.findByEmail(login.getEmail());
        if(user.getPassword().equals(encryption.encyptPassword(login.getPassword()))) {
            SuccessResponse response = new SuccessResponse(user.getId().toString(), user.getCreated(), user.getModified(), user.getLast_login(), user.getToken());
            return response;
        }
        ErrorResponse error = new ErrorResponse("Usuário e/ou senha inválidos");
        return error;
    }

}

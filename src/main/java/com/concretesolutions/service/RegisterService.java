package com.concretesolutions.service;

import com.concretesolutions.model.User;
import com.concretesolutions.repository.RegisterRepository;
import com.concretesolutions.vo.RegisterUserRequest;
import com.concretesolutions.vo.Response;
import com.concretesolutions.vo.SuccessResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class RegisterService {

    @Autowired
    private RegisterRepository repository;

    //TODO Refactor to make the merge in another class
    //TODO Create a method to generate token
    //TODO Validate email existence before save
    //TODO Make a way to hash password before save
    public Response saveUser(RegisterUserRequest user) {
        String token = "5ee946dc11508b1d5638fed1cc226cdf";
        Date created = new Date();
        //TODO update phone data on last null
        User u = new User(user.getName(), user.getEmail(), user.getPassword(), token, created, null, created, null);
        User saved = repository.save(u);
        SuccessResponse response = new SuccessResponse(saved.getId().toString(), saved.getCreated(), saved.getModified(), saved.getLast_login(), saved.getToken());
        return response;
    }

    public Response getUser(Long id){
        User user = repository.getOne(id);
        SuccessResponse response = new SuccessResponse(user.getId().toString(), user.getCreated(), user.getModified(), user.getLast_login(), user.getToken());
        return response;
    }

}

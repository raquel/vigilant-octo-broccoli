package com.concretesolutions.service;

import com.concretesolutions.model.User;
import com.concretesolutions.repository.RegisterRepository;
import com.concretesolutions.vo.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by raquel on 8/26/16.
 */

@Service
public class RegisterService {

    @Autowired
    private RegisterRepository repository;

    //TODO Refactor to make the merge in another class; remove the mocked token
    public Response saveUser(User user) {
        String token = "5ee946dc11508b1d5638fed1cc226cdf";
        Date created = new Date();
        User u = new User(user.getName(), user.getEmail(), user.getPassword(), token, created, null, created, user.getPhones());
        User saved = repository.save(u);
        Response response = new Response(saved.getId().toString(), saved.getCreated(), saved.getModified(), saved.getLast_login(), saved.getToken());
        return response;
    }

}

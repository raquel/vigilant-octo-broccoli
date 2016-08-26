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

    public Response saveUser(User user) {
        Response response = new Response("1", new Date(), null, new Date(), "fiushfushfhsjfhdsjkfhuefhkahlfawjeÇIJR83O");
        return response;
    }

}

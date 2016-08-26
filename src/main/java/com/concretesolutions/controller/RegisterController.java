package com.concretesolutions.controller;

import com.concretesolutions.model.User;
import com.concretesolutions.service.RegisterService;
import com.concretesolutions.vo.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by raquel on 8/26/16.
 */

@RestController
public class RegisterController {

    @Autowired
    RegisterService service;

    @RequestMapping(value = "/register", method = RequestMethod.POST, headers = "Content-type=application/json")
    public Response registerUser(@RequestBody User user){
        Response response = service.saveUser(user);
        return response;
    }
}

package com.concretesolutions.controller;

import com.concretesolutions.service.RegisterService;
import com.concretesolutions.vo.RegisterUserRequest;
import com.concretesolutions.vo.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RegisterController {

    @Autowired
    RegisterService service;

    @RequestMapping(value = "/register", method = RequestMethod.POST, headers = "Content-type=application/json")
    public Response registerUser(@RequestBody RegisterUserRequest request){
        Response response = service.saveUser(request);
        return response;
    }
}

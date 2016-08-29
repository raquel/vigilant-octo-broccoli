package com.concretesolutions.controller;

import com.concretesolutions.service.LoginService;
import com.concretesolutions.vo.LoginRequest;
import com.concretesolutions.vo.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    LoginService service;

    //TODO Put errors on 401 status code
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public Response getLogin(@RequestHeader LoginRequest request){
        Response response = service.authenticate(request);
        return response;
    }

}

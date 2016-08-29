package com.concretesolutions.controller;

import com.concretesolutions.service.ProfileService;
import com.concretesolutions.vo.ProfileRequest;
import com.concretesolutions.vo.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProfileController {

    @Autowired
    ProfileService service;

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public Response getProfile(@RequestHeader ProfileRequest request, @RequestParam String id){
        Response response = service.getProfile(request, id);
        return response;
    }

}

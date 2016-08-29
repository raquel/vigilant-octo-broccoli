package com.concretesolutions.service;

import com.concretesolutions.model.User;
import com.concretesolutions.repository.ProfileRepository;
import com.concretesolutions.vo.ErrorResponse;
import com.concretesolutions.vo.ProfileRequest;
import com.concretesolutions.vo.Response;
import com.concretesolutions.vo.SuccessResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    private static final long THIRTY_MINUTES = 30 * 60 * 1000;

    @Autowired
    ProfileRepository repository;

    public Response getProfile(ProfileRequest request, String id) {
        User user = repository.getOne(Long.valueOf(id));
        if (request.getToken().equals(user.getToken())) {
            if (System.currentTimeMillis() - user.getLast_login().getTime() < THIRTY_MINUTES) {
                SuccessResponse response = new SuccessResponse(user.getId().toString(), user.getCreated(), user.getModified(), user.getLast_login(), user.getToken());
                return response;
            } else {
                ErrorResponse error = new ErrorResponse("Sessão inválida");
                return error;
            }
        }
        ErrorResponse error = new ErrorResponse("Não autorizado");
        return error;
    }

}

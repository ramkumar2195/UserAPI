package com.jitpay.app.data.service;

import com.jitpay.app.data.model.UserDetails;
import com.jitpay.app.data.payload.request.SaveUpdateUserData;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

    public UserDetails saveUserDetails(SaveUpdateUserData saveData);
}

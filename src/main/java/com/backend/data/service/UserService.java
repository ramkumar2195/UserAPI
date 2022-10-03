package com.backend.data.service;

import com.backend.data.model.UserDetails;
import com.backend.data.payload.request.SaveUpdateUserData;
import org.springframework.stereotype.Component;

@Component
public interface UserService {

    public Boolean saveUserDetails(SaveUpdateUserData saveData);

    public UserDetails getUserLatestLocation(String userID);
}

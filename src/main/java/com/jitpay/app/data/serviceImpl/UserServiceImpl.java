package com.jitpay.app.data.serviceImpl;

import com.jitpay.app.data.model.UserDetails;
import com.jitpay.app.data.payload.request.SaveUpdateUserData;
import com.jitpay.app.data.repository.UserRepository;
import com.jitpay.app.data.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserDetails userDetails;

    @Override
    public UserDetails saveUserDetails(SaveUpdateUserData saveData) {
        if(userRepository.existsById(saveData.getUserId())){
            userDetails=userRepository.getById(saveData.getUserId());
        }
        userDetails.setUserId(saveData.getUserId());
        userDetails.setEmail(saveData.getEmail());
        userDetails.setCreatedOn(saveData.getCreatedOn());
        userDetails.setFirstName(saveData.getFirstName());
        userDetails.setSecondName(saveData.getSecondName());
        userDetails= userRepository.save(userDetails);
        return userDetails;
    }
}

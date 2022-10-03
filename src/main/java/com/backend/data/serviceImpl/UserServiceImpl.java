package com.backend.data.serviceImpl;

import com.backend.data.payload.request.SaveUpdateUserData;
import com.backend.data.repository.UserRepository;
import com.backend.data.service.UserService;
import com.backend.data.model.UserDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserRepository userRepository;

    @Override
    public Boolean saveUserDetails(SaveUpdateUserData saveData) {
        try{
        log.info("Inside SaveUSerDetails IMPL");
        UserDetails userDetails = new UserDetails();
        userDetails.setUserId(saveData.getUserId());
        userDetails.setEmail(saveData.getEmail());
        userDetails.setCreatedOn(saveData.getCreatedOn());
        userDetails.setFirstName(saveData.getFirstName());
        userDetails.setSecondName(saveData.getSecondName());
        userRepository.save(userDetails);
        log.info("User Details Saved Successfully");
        return true;
    }catch(Exception e){
        log.info("Exception Occurred while saving User Location in Location IMPL "+e.toString());
        return false;
    }
    }

    @Override
    public UserDetails getUserLatestLocation(String userId){
        return userRepository.getUserByLatestLocation(userId);
    }
}

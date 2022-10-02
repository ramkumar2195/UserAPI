package com.jitpay.app.controller;


import com.jitpay.app.data.payload.request.SaveLocation;
import com.jitpay.app.data.payload.request.SaveUpdateUserData;
import com.jitpay.app.data.service.UserService;
import com.jitpay.app.utility.ResponseHandler;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/operations")
@RequiredArgsConstructor
public class UserController {

    Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userServObj;


   /* @PostMapping("/saveUserLocation")
    public ResponseEntity<?> saveUserLocation(@RequestBody SaveLocation saveLocationObj){

    }*/

    @PostMapping("/saveUpdateUserData")
    public ResponseEntity<?> saveUpdateUserData(@RequestBody SaveUpdateUserData saveUpdateUserDataObj){
        try{
            return ResponseHandler.generateResponse(HttpStatus.OK, true, "User Details Saved Successfully", userServObj.saveUserDetails(saveUpdateUserDataObj));
        }catch(Exception e){
            return ResponseHandler.generateResponse(HttpStatus.OK, false, "Exception Occured whiile saving User Data", null);
        }
    }

   /* @RequestMapping(value = "/getUserDataByLocation/userId/{userId}", method = RequestMethod.GET)
    public ResponseEntity<?> getUserDatawithLatestLocation(@PathVariable String userId) {

    }

    @RequestMapping(value = "/getUserLocationByData/fromDate/{fromDate}/toDate/{toDate}", method = RequestMethod.GET)
    public ResponseEntity<?> getUserDatawithLatestLocation(@PathVariable LocalDateTime fromDate, @PathVariable LocalDateTime toDate) {

    }*/

    }

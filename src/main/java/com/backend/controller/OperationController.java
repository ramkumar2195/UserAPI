package com.backend.controller;

import com.backend.data.payload.request.SaveUpdateUserData;
import com.backend.data.service.UserService;
import com.backend.utility.ResponseHandler;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/operations")
@RequiredArgsConstructor
public class OperationController {

    Logger log = LoggerFactory.getLogger(OperationController.class);

    @Autowired
    UserService userServObj;

    @GetMapping("/find")
    public String printFind(@RequestParam String ram){
        log.info("Inside saveUpdateUserData  "+ram);
        System.out.println("Inside saveUpdateUserData");
        return "ram";
    }

    @PostMapping("/saveUpdateUserData")
    public ResponseEntity<?> saveUpdateUserData(@RequestBody SaveUpdateUserData saveUpdateUserDataObj){
        System.out.println("Inside saveUpdateUserData");
        log.info("Inside saveUpdateUserData  "+saveUpdateUserDataObj.getUserId());
        try{
            log.info("Inside saveUpdateUserData  "+saveUpdateUserDataObj.getUserId());
            Boolean retVal=userServObj.saveUserDetails(saveUpdateUserDataObj);
            log.info("Save Data return value  "+retVal);
            return ResponseHandler.generateResponse(HttpStatus.OK, true, "User Details Saved Successfully", null);
        }catch(Exception e){
            return ResponseHandler.generateResponse(HttpStatus.OK, false, "Exception Occurred while saving User Data", null);
        }
    }
}

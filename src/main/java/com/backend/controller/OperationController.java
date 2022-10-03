package com.backend.controller;

import com.backend.data.payload.request.GetLocationBetweenRange;
import com.backend.data.payload.request.SaveLocation;
import com.backend.data.payload.request.SaveUpdateUserData;
import com.backend.data.service.LocationService;
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

    @Autowired
    LocationService userLocationObj;

    @PostMapping("/saveUpdateUserData")
    public ResponseEntity<?> saveUpdateUserData(@RequestBody SaveUpdateUserData saveUpdateUserDataObj){
        log.info("Inside saveUpdateUserData  "+saveUpdateUserDataObj.getUserId());
        try{
            Boolean retVal=userServObj.saveUserDetails(saveUpdateUserDataObj);
            log.info("Save Data return value  "+retVal);
            return ResponseHandler.generateResponse(HttpStatus.OK, true, "User Details Saved Successfully", null);
        }catch(Exception e){
            return ResponseHandler.generateResponse(HttpStatus.OK, false, "Exception Occurred while saving User Data", null);
        }
    }

    @PostMapping("/saveUserLocation")
    public ResponseEntity<?> saveUserLocation(@RequestBody SaveLocation saveLocationObj){
        try{
            Boolean retVal=userLocationObj.saveUserLocation(saveLocationObj);
            log.info("Save location return value  "+retVal);
            return ResponseHandler.generateResponse(HttpStatus.OK, true, "User Location Saved Successfully", null);
        }catch(Exception e){
            return ResponseHandler.generateResponse(HttpStatus.OK, false, "Exception Occurred while saving user location", null);
        }
    }


    @GetMapping("/getUserLatestLocation")
    public ResponseEntity<?> getUserLatestLocation(@RequestParam String userId) {
        try {
            return ResponseHandler.generateResponse(HttpStatus.OK, true, "User Latest Location Retrieved Successfully", userServObj.getUserLatestLocation(userId));
        } catch (Exception e) {
            return ResponseHandler.generateResponse(HttpStatus.OK, false, "Error in Retrieval Price User Latest Location", null);
        }
    }

    @PostMapping("/getUserLocationbetweenRange")
    public ResponseEntity<?> getUserLocationbetweenRange(@RequestBody GetLocationBetweenRange dateObj) {
        try {
            return ResponseHandler.generateResponse(HttpStatus.OK, true, "User Location Retrieved Successfully", userLocationObj.getByCreatedOnBetween(dateObj));
        } catch (Exception e) {
            return ResponseHandler.generateResponse(HttpStatus.OK, false, "Error in Retrieval User Location", null);
        }
    }
}

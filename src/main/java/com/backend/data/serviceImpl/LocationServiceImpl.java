package com.backend.data.serviceImpl;

import com.backend.data.model.UserDetails;
import com.backend.data.model.UserLocations;
import com.backend.data.payload.request.GetLocationBetweenRange;
import com.backend.data.payload.request.SaveLocation;
import com.backend.data.repository.LocationRepository;
import com.backend.data.repository.UserRepository;
import com.backend.data.service.LocationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {


    Logger log = LoggerFactory.getLogger(LocationServiceImpl.class);

    @Autowired
    LocationRepository locationRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public Boolean saveUserLocation(SaveLocation saveLocation) {
        try {
            log.info("Inside saveUserLocation IMPL");
            UserLocations userLocations = new UserLocations();
            userLocations.setCreatedOn(saveLocation.getCreatedOn());
            userLocations.setLatitude(saveLocation.getLocation().getLatitude());
            userLocations.setLongitude(saveLocation.getLocation().getLongitude());
            UserDetails userDetails = userRepository.findByUserId(saveLocation.getUserId());
            log.info("Got UserId  " + saveLocation.getUserId());
            userLocations.setUserDetails(userDetails);
            locationRepository.save(userLocations);
            log.info("User Location Saved Successfully");
        }catch(Exception e){
            log.info("Exception Occurred while saving User Location in Location IMPL "+e.toString());
            return false;
        }
        return true;
    }

    public List<UserLocations> getByCreatedOnBetween(GetLocationBetweenRange dateObj){
        return locationRepository.findByCreatedOnBetween(dateObj.getFromDate(),dateObj.getToDate());
    }
}

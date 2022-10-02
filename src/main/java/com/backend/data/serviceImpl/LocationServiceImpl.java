package com.backend.data.serviceImpl;

import com.backend.data.model.UserLocations;
import com.backend.data.payload.request.SaveLocation;
import com.backend.data.repository.LocationRepository;
import com.backend.data.service.LocationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {


    Logger log = LoggerFactory.getLogger(LocationServiceImpl.class);

    @Autowired
    LocationRepository locationRepository;

    @Override
    public Boolean saveUserLocation(SaveLocation saveLocation) {
        log.info("Inside saveUserLocation IMPL");
        UserLocations userLocations = new UserLocations();
        userLocations.setCreatedOn(saveLocation.getCreatedOn());
        userLocations.setLatitude(saveLocation.getLocation().getLatitude());
        userLocations.setLongitude(saveLocation.getLocation().getLongitude());
        locationRepository.save(userLocations);
        log.info("User Location Saved Successfully");
        return true;
    }
}

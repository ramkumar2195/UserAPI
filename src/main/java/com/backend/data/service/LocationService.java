package com.backend.data.service;


import com.backend.data.payload.request.SaveLocation;
import com.backend.data.payload.request.SaveUpdateUserData;
import org.springframework.stereotype.Component;

@Component
public interface LocationService {

    public Boolean saveUserLocation(SaveLocation saveLocation);
}

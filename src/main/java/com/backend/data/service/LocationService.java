package com.backend.data.service;


import com.backend.data.model.UserLocations;
import com.backend.data.payload.request.GetLocationBetweenRange;
import com.backend.data.payload.request.SaveLocation;
import com.backend.data.payload.request.SaveUpdateUserData;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LocationService {

    public Boolean saveUserLocation(SaveLocation saveLocation);

    public List<UserLocations> getByCreatedOnBetween(GetLocationBetweenRange dateObj);
}

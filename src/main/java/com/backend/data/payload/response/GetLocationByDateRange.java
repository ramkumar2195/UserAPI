package com.backend.data.payload.response;


import java.io.Serializable;

public class GetLocationByDateRange implements Serializable {

    private String userId;
    private Locations locations;
    
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Locations getLocations() {
		return locations;
	}
	public void setLocations(Locations locations) {
		this.locations = locations;
	}
    
    
}

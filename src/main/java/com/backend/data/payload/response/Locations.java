package com.backend.data.payload.response;


import com.backend.data.payload.request.Location;
import java.io.Serializable;
import java.time.LocalDateTime;

public class Locations implements Serializable{

    private LocalDateTime createdOn;
    private Location location;
    
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
    
    
}

package com.backend.data.payload.request;

import java.io.Serializable;
import java.time.LocalDateTime;

public class SaveLocation implements Serializable{

    private String userId;
    private LocalDateTime createdOn;
    private Location location;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
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

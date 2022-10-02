package com.backend.data.payload.request;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
@Data
public class SaveLocation implements Serializable{

    private String userId;
    private LocalDateTime createdOn;
    private Location location;
    
}

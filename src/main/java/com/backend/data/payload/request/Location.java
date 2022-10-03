package com.backend.data.payload.request;

import lombok.Data;

import java.io.Serializable;


@Data
public class Location implements Serializable {

    private Double latitude;
    private Double longitude;
    
    
}

package com.jitpay.app.data.payload.response;


import lombok.Data;

@Data
public class GetLocationByDateRange {

    private final String userId;
    private final Locations locations;
}

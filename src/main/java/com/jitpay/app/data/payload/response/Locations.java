package com.jitpay.app.data.payload.response;


import com.jitpay.app.data.payload.request.Location;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class Locations {

    private final LocalDateTime createdOn;
    private final Location location;
}

package com.jitpay.app.data.payload.response;


import com.jitpay.app.data.payload.request.Location;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserDataWithLatestLocation {

    private final String userId;
    private final LocalDateTime createdOn;
    private final String email;
    private final String firstName;
    private final String secondName;
    private final Location location;

}

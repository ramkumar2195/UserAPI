package com.jitpay.app.data.payload.request;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SaveLocation {

    private final String userId;
    private final LocalDateTime createdOn;
    private final Location location;
}

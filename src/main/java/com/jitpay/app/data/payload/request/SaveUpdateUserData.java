package com.jitpay.app.data.payload.request;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SaveUpdateUserData {

    private final String userId;
    private final LocalDateTime createdOn;
    private final String email;
    private final String firstName;
    private final String secondName;

}

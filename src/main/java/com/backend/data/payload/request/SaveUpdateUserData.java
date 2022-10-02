package com.backend.data.payload.request;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class SaveUpdateUserData implements Serializable {

    private String userId;
    private LocalDateTime createdOn;
    private String email;
    private String firstName;
    private String secondName;

}

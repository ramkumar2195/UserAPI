package com.backend.data.payload.request;


import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class GetLocationBetweenRange implements Serializable {
    private LocalDateTime fromDate;
    private LocalDateTime toDate;
}

package com.jitpay.app.data.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.catalina.User;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="location_details")
public class UserLocations {

    @Id
    private Integer id;

    @Column(name="createdOn")
    private LocalDateTime createdOn;

    @Column(name="latitude")
    private Double latitude;

    @Column(name="longitude")
    private Double longitude;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    @JsonIgnoreProperties("locationList")
    private UserDetails userDetails;
}

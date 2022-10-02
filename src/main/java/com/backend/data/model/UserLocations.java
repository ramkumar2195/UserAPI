package com.backend.data.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="location_details")
public class UserLocations {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="created_on")
    private LocalDateTime createdOn;

    @Column(name="latitude")
    private Double latitude;

    @Column(name="longitude")
    private Double longitude;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @JsonIgnoreProperties("locationList")
    private UserDetails userDetails;
}

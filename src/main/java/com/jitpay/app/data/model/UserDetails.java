package com.jitpay.app.data.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="user_details")
public class UserDetails {

    @Id
    private String userId;

    @Column(name="createdOn")
    private LocalDateTime createdOn;

    @Column(name="email")
    private String email;

    @Column(name="firstName")
    private String firstName;

    @Column(name="secondName")
    private String secondName;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "userDetails", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("user")
    private List<UserLocations> locationList = new ArrayList<>();

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public List<UserLocations> getLocationList() {
        return locationList;
    }

    public void setLocationList(List<UserLocations> locationList) {
        this.locationList = locationList;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "userId='" + userId + '\'' +
                ", createdOn=" + createdOn +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", locationList=" + locationList +
                '}';
    }
}

package com.jitpay.app.data.repository;


import com.jitpay.app.data.model.UserLocations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<UserLocations,Integer> {
}

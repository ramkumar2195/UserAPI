package com.backend.data.repository;

import com.backend.data.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDetails,String> {

     @Query(value="select ud.*,ld.* from user_details ud inner join location_details ld on ud.user_id=ld.user_id \n" +
             " where ud.user_id=:user_id order by ld.created_on desc limit 1;", nativeQuery = true)
     UserDetails getUserByLatestLocation(@Param("user_id") String user_id);


     UserDetails findByUserId(String userId);

}

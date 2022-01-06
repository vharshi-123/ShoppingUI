package com.harshitha.shopping.profileservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.harshitha.shopping.profileservice.entity.UserProfile;

import java.util.Optional;

@Repository
public interface UserProfileRepository extends MongoRepository<UserProfile, String> {

    Optional<UserProfile> findByFullName(String fullName);
    Optional<UserProfile> findByEmail(String email);
    Optional<UserProfile> findByProfileId(int profileId);

    Optional<UserProfile> findByMobileNumber(long mobileNumber);

    Optional<UserProfile> findByEmailAndPassword(String email, String password);

    UserProfile findTopByOrderByProfileIdDesc();

    Boolean existsByEmail(String email);

}

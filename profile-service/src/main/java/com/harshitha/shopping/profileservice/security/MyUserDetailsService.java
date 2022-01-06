package com.harshitha.shopping.profileservice.security;

import com.harshitha.shopping.profileservice.dao.UserProfileRepository;
import com.harshitha.shopping.profileservice.entity.UserProfile;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class MyUserDetailsService implements UserDetailsService {

    private final UserProfileRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<UserProfile> optionalUser = userRepo.findByEmail(email);
        return optionalUser.map(MyUserDetails::new).orElse(null);
    }
}

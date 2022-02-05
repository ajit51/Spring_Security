package com.springsecurity.springsecuritylearn.service;

import com.springsecurity.springsecuritylearn.model.CustomUserDetails;
import com.springsecurity.springsecuritylearn.model.User;
import com.springsecurity.springsecuritylearn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByusername(username);
        if (null == user)
            throw new UsernameNotFoundException("No User found");

        return new CustomUserDetails(user);
    }
}

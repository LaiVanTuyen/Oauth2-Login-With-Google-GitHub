package com.ptit.oauth2.service;

import com.ptit.oauth2.dto.UserRegisteredDTO;
import com.ptit.oauth2.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface DefaultUserService extends UserDetailsService {
    User save(UserRegisteredDTO userRegisteredDTO);
}

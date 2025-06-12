package com.practice.one.Services;

import org.springframework.stereotype.Service;

import com.practice.one.DTO.UserDTO;

@Service
public class UserService {
    public UserDTO signup(UserDTO userDTO) {
        System.out.println("user service signup -- " + userDTO);
        return userDTO;
    }
}

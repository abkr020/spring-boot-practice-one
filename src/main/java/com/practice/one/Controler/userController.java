package com.practice.one.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.one.DTO.UserDTO;
import com.practice.one.Services.UserService;

@RestController
@RequestMapping(path = "auth")
public class userController {
    @Autowired
    private UserService userService;
    @PostMapping(path = "/signup")
    public UserDTO signup(@RequestBody UserDTO userDTO){
        System.out.println("signup user dto -- " + userDTO);
        return userService.signup(userDTO);
    }

    
}

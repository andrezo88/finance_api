package com.Andrel.financesheet.controller;

import com.Andrel.financesheet.dto.UserDto;
import com.Andrel.financesheet.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private  final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/v1/users")
    public ResponseEntity<Void> createUser(@RequestBody UserDto userDto){
        userService.createUser(userDto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/v1/users/")
    public ResponseEntity<List<UserDto>> findAllUsers(){
        List<UserDto> allUsers = userService.findAll();
        return ResponseEntity.ok().body(allUsers);
    }


}

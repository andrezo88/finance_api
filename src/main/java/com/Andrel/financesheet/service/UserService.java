package com.Andrel.financesheet.service;

import com.Andrel.financesheet.dto.UserDto;
import com.Andrel.financesheet.mapper.UserMapper;
import com.Andrel.financesheet.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }


    public void createUser(UserDto userDto){
        userRepository.save(userMapper.toModel(userDto));
    }
}

package com.Andrel.financesheet.mapper;

import com.Andrel.financesheet.dto.UserDto;
import com.Andrel.financesheet.model.UserModel;

public class UserMapper {

    public static UserModel toModel(UserDto userDto){
        var userModel = new UserModel();
        userModel.setId(userDto.getId());
        userModel.setName(userDto.getName());
        userModel.setSurname(userDto.getSurname());
        userModel.setEmail(userDto.getEmail());
        return userModel;
    }

    public static UserDto toDto(UserModel userModel){
        var userDto = new UserDto();
        userDto.setId(userModel.getId());
        userDto.setName(userModel.getName());
        userDto.setSurname(userModel.getSurname());
        userDto.setEmail(userModel.getEmail());
        return userDto;
    }
}

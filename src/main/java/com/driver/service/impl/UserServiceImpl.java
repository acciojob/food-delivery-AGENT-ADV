package com.driver.service.impl;

import com.driver.io.entity.UserEntity;
import com.driver.io.repository.UserRepository;
import com.driver.service.UserService;
import com.driver.shared.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public UserDto createUser(UserDto user) throws Exception
    {
        UserEntity userEntity =  userRepository.findById(user.getId()).get();
        if(userEntity==null)
            throw new Exception("User already exists");

        userEntity =
                UserEntity.builder()
                .id(user.getId())
                .userId(user.getUserId())
                .email(user.getEmail())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .build();
        userRepository.save(userEntity);
        return user;
    }

    @Override
    public UserDto getUser(String email) throws Exception
    {
        UserEntity userEntity = userRepository.findByEmail(email);
        if(userEntity==null)
            throw new Exception("User doesn't exist");

        UserDto userDto =
                UserDto.builder()
                .id(userEntity.getId())
                .firstName(userEntity.getFirstName())
                .lastName(userEntity.getLastName())
                .email(userEntity.getEmail())
                .userId(userEntity.getUserId())
                .build();
        return userDto;
    }

    @Override
    public UserDto getUserByUserId(String userId) throws Exception
    {
        UserEntity userEntity = userRepository.findByUserId(userId);

        if(userEntity==null)
            throw new Exception("User doesn't exist");


        UserDto userDto =
                UserDto.builder()
                .id(userEntity.getId())
                .firstName(userEntity.getFirstName())
                .lastName(userEntity.getLastName())
                .email(userEntity.getEmail())
                .userId(userEntity.getUserId())
                .build();

        return userDto;
    }

    @Override
    public UserDto updateUser(String userId, UserDto user) throws Exception
    {
        UserEntity userEntity = userRepository.findByUserId(userId);
        if(userEntity==null)
            throw new Exception("User doesn't exist");

        UserEntity userEntity1 =
                UserEntity.builder()
                .id(user.getId())
                .userId(user.getUserId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .build();
        userRepository.save(userEntity1);
        return user;
    }

    @Override
    public void deleteUser(String userId) throws Exception
    {
        UserEntity userEntity = userRepository.findByUserId(userId);
        if(userEntity==null)
            throw new Exception("User doesn't exist");

        userRepository.deleteById(userEntity.getId());
    }

    @Override
    public List<UserDto> getUsers()
    {
        List<UserEntity> userEntityList = (List) userRepository.findAll();
        List<UserDto> userDtoList = new ArrayList<>();
        for(UserEntity userEntity : userEntityList)
        {
            UserDto userDto =
                    UserDto.builder()
                    .id(userEntity.getId())
                    .userId(userEntity.getUserId())
                    .firstName(userEntity.getFirstName())
                    .lastName(userEntity.getLastName())
                    .email(userEntity.getEmail())
                    .build();
            userDtoList.add(userDto);
        }
        return userDtoList;
    }
}

package com.example.springdatajpa.service;

import com.example.springdatajpa.entity.UserEntity;
import com.example.springdatajpa.repos.UserEntityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserEntityRepo UserEntityRepo;

    public void saveUser(){
        UserEntity entity=new UserEntity();
        entity.setId(124);
        entity.setName("Amul");
        entity.setEmail("wsdr@gmail.com");
        entity.setCity("Delhi");
        entity.setGender("Male");
        entity.setAge(19);
        UserEntityRepo.save(entity);

    }

}

package com.example.springdatajpa.repos;

import com.example.springdatajpa.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserEntityRepo extends CrudRepository<UserEntity, Integer> {
}

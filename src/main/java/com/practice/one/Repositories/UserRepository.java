package com.practice.one.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.one.Entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Long>{
    
}

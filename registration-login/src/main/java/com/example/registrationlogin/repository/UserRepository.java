package com.example.registrationlogin.repository;

import com.example.registrationlogin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Abstraction
//UserRepository is a child class and JpaRepository is a parent class
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email);
}

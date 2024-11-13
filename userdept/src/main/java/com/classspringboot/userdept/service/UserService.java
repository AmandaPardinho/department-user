package com.classspringboot.userdept.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.classspringboot.userdept.entities.User;
import com.classspringboot.userdept.repositories.UserRepository;

@Service
public class UserService {

    public void UserDetails(User entity, User user) {
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setDepartment(user.getDepartment());
    }
}

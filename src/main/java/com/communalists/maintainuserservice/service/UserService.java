package com.communalists.maintainuserservice.service;

import com.communalists.maintainuserservice.converters.UserConverter;
import com.communalists.maintainuserservice.entities.User;
import com.communalists.maintainuserservice.repository.UserRepository;
import com.communalists.maintainuserservice.request.user.UserPayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserPayload retrieveUserById(String id){
        Optional<User> dbUser = userRepository.findById(id);
        User user = dbUser.orElse(User.builder().build());
        return UserConverter.entityToPayload(user);
    }

    public List<UserPayload> retrieveAllUsers(){
        List<User> dbUsers = userRepository.findAll();
        List<UserPayload> result = new ArrayList<>();
        for (User user : dbUsers){
            result.add(
                    UserConverter.entityToPayload(user)
            );
        }
        return result;
    }

    public UserPayload maintainUser(UserPayload payload){
        return UserConverter.entityToPayload(
                userRepository.save(UserConverter.payloadToEntity(payload))
        );
    }

}

package com.communalists.maintainuserservice.controller;

import com.communalists.maintainuserservice.request.user.UserPayload;
import com.communalists.maintainuserservice.request.user.UserRequest;
import com.communalists.maintainuserservice.response.ResponseStatus;
import com.communalists.maintainuserservice.response.user.UserListResponse;
import com.communalists.maintainuserservice.response.user.UserResponse;
import com.communalists.maintainuserservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(("/user"))
public class UserController {

    private static final String BLANK_STR = "";

    @Autowired
    private UserService userService;

    @GetMapping("/id/{id}")
    public ResponseEntity<UserResponse> retrieveUser(@PathVariable String id){
        UserPayload payload = userService.retrieveUserById(id);
        return ResponseEntity.ok(UserResponse.builder()
                .payload(payload)
                .responseStatus(
                        ResponseStatus.builder()
                                .error(BLANK_STR)
                                .errorDetails(BLANK_STR)
                                .build()
                )
                .build());
    }

    @GetMapping
    public ResponseEntity<UserListResponse> retrieveAllUser(){
        List<UserPayload> users = userService.retrieveAllUsers();
        return ResponseEntity.ok(
                UserListResponse.builder()
                        .payload(users)
                        .responseStatus(
                                ResponseStatus.builder()
                                        .error(BLANK_STR)
                                        .errorDetails(BLANK_STR)
                                        .build()
                        )
                        .build()
        );
    }

    @PostMapping
    public ResponseEntity<UserResponse> maintainUser(@RequestBody UserRequest request){
        return ResponseEntity.ok(
                UserResponse.builder()
                        .payload(userService.maintainUser(request.getPayload()))
                        .responseStatus(
                                ResponseStatus.builder()
                                        .error(BLANK_STR)
                                        .errorDetails(BLANK_STR)
                                        .build()
                        )
                        .build()
        );
    }

}

package com.communalists.maintainuserservice.converters;

import com.communalists.maintainuserservice.entities.User;
import com.communalists.maintainuserservice.request.user.UserPayload;

public class UserConverter {

    public static UserPayload entityToPayload(User user){
        return UserPayload.builder()
                .id(user.getId())
                .subjectPronoun(user.getSubjectPronoun())
                .objectPronoun(user.getObjectPronoun())
                .password(user.getPassword())
                .name(user.getName())
                .isRemote(user.isRemote())
                .address(AddressConverter.entityToPayload(user.getAddress()))
                .email(user.getEmail())
                .build();
    }

    public static User payloadToEntity(UserPayload user){
        return User.builder()
                .id(user.getId())
                .subjectPronoun(user.getSubjectPronoun())
                .objectPronoun(user.getObjectPronoun())
                .password(user.getPassword())
                .name(user.getName())
                .isRemote(user.getIsRemote())
                .address(AddressConverter.payloadToEntity(user.getAddress()))
                .email(user.getEmail())
                .build();
    }

}

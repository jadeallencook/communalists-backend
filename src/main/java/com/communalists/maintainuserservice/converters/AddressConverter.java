package com.communalists.maintainuserservice.converters;

import com.communalists.maintainuserservice.entities.Address;
import com.communalists.maintainuserservice.request.user.AddressPayload;

public class AddressConverter {

    public static Address payloadToEntity(AddressPayload payload){
        return Address.builder()
                .id(payload.getId())
                .city(payload.getCity())
                .county(payload.getCounty())
                .state(payload.getState())
                .street(payload.getStreet())
                .zipCode(payload.getZipCode())
                .build();
    }

    public static AddressPayload entityToPayload(Address address){
        return AddressPayload.builder()
                .id(address.getId())
                .city(address.getCity())
                .county(address.getCounty())
                .state(address.getState())
                .street(address.getStreet())
                .zipCode(address.getZipCode())
                .build();
    }

}

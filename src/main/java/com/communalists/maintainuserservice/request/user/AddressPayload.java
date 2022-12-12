package com.communalists.maintainuserservice.request.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressPayload {
    private String id;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String county;

}

package com.communalists.maintainuserservice.request.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserPayload {
    private String id;
    private String name;
    private String subjectPronoun;
    private String objectPronoun;
    @JsonProperty("isRemote")
    private Boolean isRemote;
    private String email;
    private String password;
    private AddressPayload address;
}

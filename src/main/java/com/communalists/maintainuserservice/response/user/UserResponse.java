package com.communalists.maintainuserservice.response.user;

import com.communalists.maintainuserservice.request.user.UserPayload;
import com.communalists.maintainuserservice.response.ResponseStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private UserPayload payload;
    private ResponseStatus responseStatus;
}

package com.sics.auth.app.assembler;

import com.sics.auth.client.dto.LoginRequest;
import com.sics.auth.client.dto.LoginResponse;
import com.sics.auth.domain.dto.LoginCommand;
import com.sics.auth.domain.dto.LoginResult;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthenticationAssembler {
    AuthenticationAssembler INSTANCE = Mappers.getMapper(AuthenticationAssembler.class);
    LoginCommand toLoginCommand(LoginRequest loginRequest);
    LoginResponse toLoginResponse(LoginResult loginResult);
}

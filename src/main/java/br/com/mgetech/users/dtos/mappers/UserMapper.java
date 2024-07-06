package br.com.mgetech.users.dtos.mappers;

import br.com.mgetech.users.dtos.users.CreateUserRequestDto;
import br.com.mgetech.users.entities.User;

public class UserMapper {
    public static User toEntity(CreateUserRequestDto createUserRequestDto) {
        var user = new User();
        user.setName(createUserRequestDto.name());
        user.setEmail(createUserRequestDto.email());
        user.setPassword(createUserRequestDto.password());

        return user;
    }
}

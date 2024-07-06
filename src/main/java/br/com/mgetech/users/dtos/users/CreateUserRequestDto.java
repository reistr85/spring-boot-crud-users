package br.com.mgetech.users.dtos.users;

import br.com.mgetech.users.entities.User;

import java.util.List;
import java.util.stream.Collectors;

public record CreateUserRequestDto(
        String name,
        String email,
        String password
) {
}

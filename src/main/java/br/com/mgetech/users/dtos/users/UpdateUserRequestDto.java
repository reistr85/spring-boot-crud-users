package br.com.mgetech.users.dtos.users;

public record UpdateUserRequestDto(
        String name,
        String email
) {
}

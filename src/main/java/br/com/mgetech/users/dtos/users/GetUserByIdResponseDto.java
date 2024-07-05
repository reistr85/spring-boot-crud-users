package br.com.mgetech.users.dtos.users;

import br.com.mgetech.users.entities.User;

public record GetUserByIdResponseDto(Long id, String name, String email) {
    public static GetUserByIdResponseDto toDTO(User user) {
        return new GetUserByIdResponseDto(user.getId(),user.getName(), user.getEmail());
    }

    public static User toEntity(GetUserByIdResponseDto getAllUsersResponseDto) {
        var user = new User();
        user.setId(getAllUsersResponseDto.id());
        user.setName(getAllUsersResponseDto.name());
        user.setEmail(getAllUsersResponseDto.email());

        return user;
    }
}

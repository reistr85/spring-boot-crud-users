package br.com.mgetech.users.dtos.users;

import br.com.mgetech.users.entities.User;

import java.util.List;
import java.util.stream.Collectors;

public record GetAllUsersResponseDto(Long id, String name, String email) {
    public static List<GetAllUsersResponseDto> toDTOs(List<User> users) {
        return users.stream()
                .map(item -> new GetAllUsersResponseDto(item.getId(),item.getName(), item.getEmail()))
                .collect(Collectors.toList());
    }

    public static User toEntity(GetAllUsersResponseDto getAllUsersResponseDto) {
        var user = new User();
        user.setId(getAllUsersResponseDto.id());
        user.setName(getAllUsersResponseDto.name());
        user.setEmail(getAllUsersResponseDto.email());

        return user;
    }
}

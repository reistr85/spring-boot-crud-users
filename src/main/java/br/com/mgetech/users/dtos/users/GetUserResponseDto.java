package br.com.mgetech.users.dtos.users;

import br.com.mgetech.users.entities.User;

import java.util.List;
import java.util.stream.Collectors;

public record GetUserResponseDto(Long id, String name, String email) {
    public static GetUserResponseDto toDTO(User user) {
        return new GetUserResponseDto(user.getId(),user.getName(), user.getEmail());
    }

    public static List<GetUserResponseDto> toDTOs(List<User> users) {
        return users.stream()
                .map(item -> new GetUserResponseDto(item.getId(),item.getName(), item.getEmail()))
                .collect(Collectors.toList());
    }
}

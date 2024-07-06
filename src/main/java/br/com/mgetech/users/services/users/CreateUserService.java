package br.com.mgetech.users.services.users;

import br.com.mgetech.users.dtos.mappers.UserMapper;
import br.com.mgetech.users.dtos.users.CreateUserRequestDto;
import br.com.mgetech.users.dtos.users.GetUserResponseDto;
import org.springframework.stereotype.Service;
import br.com.mgetech.users.repositories.UserRepository;

@Service
public class CreateUserService {
  private final UserRepository userRepository;

  public CreateUserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public GetUserResponseDto execute(CreateUserRequestDto createUserRequestDto) {
    return GetUserResponseDto.toDTO(this.userRepository.save(UserMapper.toEntity(createUserRequestDto)));
  }
}

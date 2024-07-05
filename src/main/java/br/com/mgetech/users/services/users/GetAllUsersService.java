package br.com.mgetech.users.services.users;

import java.util.List;

import br.com.mgetech.users.dtos.users.GetAllUsersResponseDto;
import org.springframework.stereotype.Service;
import br.com.mgetech.users.repositories.UserRepository;

@Service
public class GetAllUsersService {
  private final UserRepository userRepository;

  public GetAllUsersService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public List<GetAllUsersResponseDto> execute() {
    return GetAllUsersResponseDto.toDTOs(this.userRepository.findAll());
  }
}

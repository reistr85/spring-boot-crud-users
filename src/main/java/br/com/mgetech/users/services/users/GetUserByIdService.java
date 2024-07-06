package br.com.mgetech.users.services.users;

import br.com.mgetech.users.dtos.users.GetUserResponseDto;
import br.com.mgetech.users.exceptions.NotFoundException;
import org.springframework.stereotype.Service;
import br.com.mgetech.users.repositories.UserRepository;

@Service
public class GetUserByIdService {
  private final UserRepository userRepository;

  public GetUserByIdService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public GetUserResponseDto execute(Long id) {
    return GetUserResponseDto.toDTO(this.userRepository.findById(id).orElseThrow(NotFoundException::new));
  }
}

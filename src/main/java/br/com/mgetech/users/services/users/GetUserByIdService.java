package br.com.mgetech.users.services.users;

import br.com.mgetech.users.dtos.users.GetUserByIdResponseDto;
import org.springframework.stereotype.Service;
import br.com.mgetech.users.repositories.UserRepository;

@Service
public class GetUserByIdService {
  private final UserRepository userRepository;

  public GetUserByIdService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public GetUserByIdResponseDto execute(Long id) {
    return GetUserByIdResponseDto.toDTO(this.userRepository.findById(id).orElseThrow());
  }
}

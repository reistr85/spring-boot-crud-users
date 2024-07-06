package br.com.mgetech.users.services.users;

import br.com.mgetech.users.dtos.users.UpdateUserRequestDto;
import br.com.mgetech.users.exceptions.NotFoundException;
import org.springframework.stereotype.Service;
import br.com.mgetech.users.repositories.UserRepository;

@Service
public class UpdateUserByIdService {
  private final UserRepository userRepository;

  public UpdateUserByIdService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void execute(Long id, UpdateUserRequestDto updateUserRequestDto) {
    this.userRepository.findById(id).map(existingUser -> {
      existingUser.setName(updateUserRequestDto.name());
      existingUser.setEmail(updateUserRequestDto.email());
      this.userRepository.save(existingUser);
      return existingUser;
    }).orElseThrow(NotFoundException::new);
  }
}

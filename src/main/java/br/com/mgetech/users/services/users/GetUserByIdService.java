package br.com.mgetech.users.services.users;

import org.springframework.stereotype.Service;
import br.com.mgetech.users.entities.User;
import br.com.mgetech.users.repositories.UserRepository;

@Service
public class GetUserByIdService {
  private final UserRepository userRepository;

  public GetUserByIdService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User execute(Long id) {
    return this.userRepository.findById(id).orElse(null);
  }
}

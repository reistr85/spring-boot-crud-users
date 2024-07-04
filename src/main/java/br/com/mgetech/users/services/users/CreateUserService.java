package br.com.mgetech.users.services.users;

import org.springframework.stereotype.Service;
import br.com.mgetech.users.entities.User;
import br.com.mgetech.users.repositories.UserRepository;

@Service
public class CreateUserService {
  private final UserRepository userRepository;

  public CreateUserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User execute(User user) {
    return this.userRepository.save(user);
  }
}

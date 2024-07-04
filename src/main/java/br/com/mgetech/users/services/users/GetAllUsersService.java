package br.com.mgetech.users.services.users;

import java.util.List;
import org.springframework.stereotype.Service;
import br.com.mgetech.users.entities.User;
import br.com.mgetech.users.repositories.UserRepository;

@Service
public class GetAllUsersService {
  private final UserRepository userRepository;

  public GetAllUsersService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public List<User> execute() {
    return this.userRepository.findAll();
  }
}

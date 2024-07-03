package br.com.mgetech.users.service.users;

import java.util.List;
import org.springframework.stereotype.Service;
import br.com.mgetech.users.model.User;
import br.com.mgetech.users.repository.UserRepository;

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

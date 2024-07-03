package br.com.mgetech.users.service.users;

import org.springframework.stereotype.Service;
import br.com.mgetech.users.model.User;
import br.com.mgetech.users.repository.UserRepository;

@Service
public class GetAllUserByIdService {
  private final UserRepository userRepository;

  public GetAllUserByIdService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User execute(Long id) {
    return this.userRepository.findById(id).orElse(null);
  }
}

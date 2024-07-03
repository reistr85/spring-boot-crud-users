package br.com.mgetech.users.service.users;

import org.springframework.stereotype.Service;

import br.com.mgetech.users.model.User;
import br.com.mgetech.users.repository.UserRepository;

@Service
public class DeleteUserByIdService {
  private final UserRepository userRepository;

  public DeleteUserByIdService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void execute(Long id) {
    User user = this.userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    this.userRepository.delete(user);
  }
}

package br.com.mgetech.users.service.users;

import org.springframework.stereotype.Service;

import br.com.mgetech.users.model.User;
import br.com.mgetech.users.repository.UserRepository;

@Service
public class UpdateUserByIdService {
  private final UserRepository userRepository;

  public UpdateUserByIdService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void execute(Long id, User user) {
    this.userRepository.findById(id).map(existingUser -> {
      existingUser.setName(user.getName());
      existingUser.setEmail(user.getEmail());
      this.userRepository.save(existingUser);
      return existingUser;
    }).orElseThrow(() -> new RuntimeException("User not found"));
  }
}

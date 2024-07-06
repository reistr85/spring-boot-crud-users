package br.com.mgetech.users.services.users;

import br.com.mgetech.users.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import br.com.mgetech.users.entities.User;
import br.com.mgetech.users.repositories.UserRepository;

@Service
public class DeleteUserByIdService {
  private final UserRepository userRepository;

  public DeleteUserByIdService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void execute(Long id) {
    var user = this.userRepository.findById(id).orElseThrow(NotFoundException::new);
    this.userRepository.delete(user);
  }
}

package br.com.mgetech.users.controllers.users;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.mgetech.users.entities.User;
import br.com.mgetech.users.services.users.CreateUserService;

@RestController
@RequestMapping("users")
public class CreateUserController {
  private final CreateUserService createUserService;

  public CreateUserController(CreateUserService createUserService) {
    this.createUserService = createUserService;
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public User create(@RequestBody User user) {
    return createUserService.execute(user);
  }
}

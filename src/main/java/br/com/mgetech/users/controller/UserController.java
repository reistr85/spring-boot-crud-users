package br.com.mgetech.users.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.mgetech.users.model.User;
import br.com.mgetech.users.service.users.CreateUserService;
import br.com.mgetech.users.service.users.DeleteUserByIdService;
import br.com.mgetech.users.service.users.GetAllUserByIdService;
import br.com.mgetech.users.service.users.GetAllUsersService;
import br.com.mgetech.users.service.users.UpdateUserByIdService;

@RestController
@RequestMapping("users")
public class UserController {
  private final GetAllUsersService getAllUsersService;
  private final CreateUserService createUserService;
  private final GetAllUserByIdService getAllUserByIdService;
  private final UpdateUserByIdService updateUserByIdService;
  private final DeleteUserByIdService deleteUserByIdService;

  public UserController(GetAllUsersService getAllUsersService,
      CreateUserService createUserService, GetAllUserByIdService getAllUserByIdService,
      UpdateUserByIdService updateUserByIdService,
      DeleteUserByIdService deleteUserByIdService) {
    this.getAllUsersService = getAllUsersService;
    this.createUserService = createUserService;
    this.getAllUserByIdService = getAllUserByIdService;
    this.updateUserByIdService = updateUserByIdService;
    this.deleteUserByIdService = deleteUserByIdService;
  }

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<User> getAll() {
    return getAllUsersService.execute();
  }

  @GetMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public User getById(@PathVariable Long id) {
    return getAllUserByIdService.execute(id);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public User create(@RequestBody User user) {
    return createUserService.execute(user);
  }

  @PutMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void update(@PathVariable Long id, @RequestBody User user) {
    updateUserByIdService.execute(id, user);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@PathVariable Long id) {
    deleteUserByIdService.execute(id);
  }
}

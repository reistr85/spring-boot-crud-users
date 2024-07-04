package br.com.mgetech.users.controllers.users;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.mgetech.users.entities.User;
import br.com.mgetech.users.services.users.GetAllUsersService;

@RestController
@RequestMapping("users")
public class GetAllUsersController {
  private final GetAllUsersService getAllUsersService;

  public GetAllUsersController(GetAllUsersService getAllUsersService) {
    this.getAllUsersService = getAllUsersService;
  }

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<User> getAll() {
    return getAllUsersService.execute();
  }
}

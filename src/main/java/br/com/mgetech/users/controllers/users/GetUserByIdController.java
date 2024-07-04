package br.com.mgetech.users.controllers.users;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.mgetech.users.entities.User;
import br.com.mgetech.users.services.users.GetUserByIdService;

@RestController
@RequestMapping("users")
public class GetUserByIdController {
  private final GetUserByIdService getByIdUserService;

  public GetUserByIdController(GetUserByIdService getByIdUserService) {
    this.getByIdUserService = getByIdUserService;
  }

  @GetMapping("/{id}")
  @ResponseStatus(HttpStatus.OK)
  public User getById(@PathVariable Long id) {
    return getByIdUserService.execute(id);
  }
}

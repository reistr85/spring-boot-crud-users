package br.com.mgetech.users.controllers.users;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import br.com.mgetech.users.services.users.DeleteUserByIdService;

@RestController
@RequestMapping("users")
public class UpdateUserByIdController {
  private final DeleteUserByIdService deleteUserByIdService;

  public UpdateUserByIdController(DeleteUserByIdService deleteUserByIdService) {
    this.deleteUserByIdService = deleteUserByIdService;
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@PathVariable Long id) {
    deleteUserByIdService.execute(id);
  }
}

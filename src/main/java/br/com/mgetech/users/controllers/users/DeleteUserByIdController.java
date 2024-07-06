package br.com.mgetech.users.controllers.users;

import br.com.mgetech.users.services.users.DeleteUserByIdService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class DeleteUserByIdController {
  private final DeleteUserByIdService deleteUserByIdService;

  public DeleteUserByIdController(DeleteUserByIdService deleteUserByIdService) {
    this.deleteUserByIdService = deleteUserByIdService;
  }

  @PutMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void handle(@PathVariable Long id) {
    deleteUserByIdService.execute(id);
  }
}

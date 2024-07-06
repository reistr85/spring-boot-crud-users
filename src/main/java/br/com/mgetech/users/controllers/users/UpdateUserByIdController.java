package br.com.mgetech.users.controllers.users;

import br.com.mgetech.users.dtos.users.UpdateUserRequestDto;
import br.com.mgetech.users.services.users.UpdateUserByIdService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UpdateUserByIdController {
  private final UpdateUserByIdService updateUserByIdService;

  public UpdateUserByIdController(UpdateUserByIdService updateUserByIdService) {
    this.updateUserByIdService = updateUserByIdService;
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void handle(@PathVariable Long id, @RequestBody UpdateUserRequestDto updateUserRequestDto) {
    updateUserByIdService.execute(id, updateUserRequestDto);
  }
}

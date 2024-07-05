package br.com.mgetech.users.controllers.users;

import br.com.mgetech.users.dtos.users.GetUserByIdResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
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
  public @ResponseBody GetUserByIdResponseDto getById(@PathVariable Long id) {
    return getByIdUserService.execute(id);
  }
}

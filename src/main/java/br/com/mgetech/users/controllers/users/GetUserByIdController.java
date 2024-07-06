package br.com.mgetech.users.controllers.users;

import br.com.mgetech.users.dtos.users.GetUserResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
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
  public @ResponseBody GetUserResponseDto handle(@PathVariable Long id) {
    return getByIdUserService.execute(id);
  }
}

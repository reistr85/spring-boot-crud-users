package br.com.mgetech.users.controllers.users;

import br.com.mgetech.users.dtos.users.CreateUserRequestDto;
import br.com.mgetech.users.dtos.users.GetUserResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
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
  public @ResponseBody GetUserResponseDto handle(@RequestBody CreateUserRequestDto createUserRequestDto) {
    return createUserService.execute(createUserRequestDto);
  }
}

package br.com.mgetech.users.controllers.users;

import java.util.List;

import br.com.mgetech.users.dtos.users.GetAllUsersResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
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
  public @ResponseBody List<GetAllUsersResponseDto> getAll() {
    return getAllUsersService.execute();
  }
}

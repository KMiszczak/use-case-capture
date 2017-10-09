package de.sao.muc.maritimeusecasecapture.web.rest;

import de.sao.muc.maritimeusecasecapture.model.UserEntity;
import de.sao.muc.maritimeusecasecapture.service.UserService;
import de.sao.muc.maritimeusecasecapture.web.dto.RegisterUserDto;
import de.sao.muc.maritimeusecasecapture.web.dto.UserDto;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/api/users")
public class UserResource {
    private final UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/api/user/{id}")
    public UserEntity getUser(@PathVariable int id) {
        return userService.getUser(id);
    }

    @PostMapping
    public void register(@RequestBody RegisterUserDto registerUserDto) {
        userService.register(registerUserDto);
    }

    @GetMapping("/me")
    public Principal getMe(Principal principal) {
        return principal;
    }
}

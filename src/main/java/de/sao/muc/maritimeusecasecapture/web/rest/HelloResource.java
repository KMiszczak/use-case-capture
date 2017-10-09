package de.sao.muc.maritimeusecasecapture.web.rest;


import de.sao.muc.maritimeusecasecapture.service.UserService;
import de.sao.muc.maritimeusecasecapture.web.dto.UserDto;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/api/rest/hello")
@RestController
public class HelloResource {

    private final UserService userService;

    public HelloResource(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public String hello() {
        return "Hello Youtube";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/secured/all")
    public String securedHello() {
        return "Secured Hello";
    }

    @GetMapping("/secured/alternate")
    public String alternate() {
        return "alternate";
    }



    @GetMapping("/me")
    UserDto getMe() {
        return new UserDto();
    }



}

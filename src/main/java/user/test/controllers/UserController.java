package user.test.controllers;

import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.*;
import user.test.Entities.User;

@RestController
@RequestMapping("/user")
public class UserController {

    @SneakyThrows
    @GetMapping("/{userName}")
    public User getUserByName(@PathVariable final String userName){
            return new User(1, "Ivan", "Ivan", "Ivanov", "111@mail.ru", "111", "+375291111111", 1);
    }
}

package user.test.controllers;

import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.*;
import user.test.Entities.User;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{userName}")
    public User getUserByName(@PathVariable final String userName) {
            return new User(1, "Ivan", "Ivan", "Ivanov", "111@mail.ru", "111", "+375291111111", 1);
    }

    @PostMapping
    public void createUser(@RequestBody final User user) {

    }

    @PutMapping("/{userName}")
    public User  updateUser(@PathVariable final String username, @RequestBody final User user) {
        return user;
    }

    @DeleteMapping
    public void deleteUser(@PathVariable final String userName) {
        
    }
}

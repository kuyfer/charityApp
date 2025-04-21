
package ma.emsi.charityApp.controllers;


import ma.emsi.charityApp.Service.UsersService;
import ma.emsi.charityApp.entities.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {
    UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/Users")
    public List<Users> getUsers() {
       return (List<Users>) usersService.getAllUsers();

    }
}

package ma.emsi.charityApp.Service;

import ma.emsi.charityApp.entities.Users;

import org.springframework.stereotype.Service;

@Service
public interface UsersService {

    Users addUser(Users user);

    Users editUser(Users user);

    void deleteUser(int id);

    Users getUserById(int id);

    Iterable<Users> getAllUsers();


}

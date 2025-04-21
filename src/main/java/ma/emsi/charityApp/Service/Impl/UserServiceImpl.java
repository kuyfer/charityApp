package ma.emsi.charityApp.Service.Impl;

import ma.emsi.charityApp.Service.UsersService;
import ma.emsi.charityApp.entities.Users;
import ma.emsi.charityApp.repositories.UsersRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UsersService {

    private final UsersRepository usersRepository;

    public UserServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public Users editUser(Users user) {
        return usersRepository.save(user);
    }

    @Override
    public Users addUser(Users user) {
        return null;
    }

    @Override
    public void deleteUser(int id) {
        usersRepository.deleteById((long) id);
    }

    @Override
    public Users getUserById(int id) {
        return usersRepository.findById((long) id).orElse(null);
    }

    @Override
    public Iterable<Users> getAllUsers() {
        return usersRepository.findAll();
    }
}


package ma.emsi.charityApp.repositories;

import ma.emsi.charityApp.entities.Users;

import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Users, Long> {
    //Users findByCin(String cin);

}

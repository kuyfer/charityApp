package ma.emsi.charityApp.repositories;

import ma.emsi.charityApp.entities.Donation;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface DonationRepository extends CrudRepository<Donation, Long>{
    List<Donation> findByUserId(int userId);

    List<Donation> findByCharityId(int charityId);
}

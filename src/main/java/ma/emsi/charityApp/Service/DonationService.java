package ma.emsi.charityApp.Service;

import ma.emsi.charityApp.entities.Donation;

import java.util.List;

public interface DonationService {
    Donation addDonation(Donation donation);

    Donation editDonation(Donation donation);

    void deleteDonation(int id);

    Donation getDonationById(int id);

    List<Donation> getAllDonations();

    // Optional extras:
    List<Donation> getDonationsByUserId(int userId);

    List<Donation> getDonationsByCharityId(int charityId);
}

package ma.emsi.charityApp.Service.Impl;



import ma.emsi.charityApp.entities.Donation;
import ma.emsi.charityApp.repositories.DonationRepository;
import ma.emsi.charityApp.Service.DonationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonationServiceImpl implements DonationService {

    private final DonationRepository donationRepository;

    public DonationServiceImpl(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    @Override
    public Donation addDonation(Donation donation) {
        return donationRepository.save(donation);
    }

    @Override
    public Donation editDonation(Donation donation) {
        return donationRepository.save(donation);
    }

    @Override
    public void deleteDonation(int id) {
        donationRepository.deleteById((long) id);
    }

    @Override
    public Donation getDonationById(int id) {
        return donationRepository.findById((long) id).orElse(null);
    }

    @Override
    public List<Donation> getAllDonations() {
        return (List<Donation>) donationRepository.findAll();
    }

    @Override
    public List<Donation> getDonationsByUserId(int userId) {
        return donationRepository.findByUserId(userId);
    }

    @Override
    public List<Donation> getDonationsByCharityId(int charityId) {
        return donationRepository.findByCharityId(charityId);
    }
}


package ma.emsi.charityApp.Service.Impl;

import ma.emsi.charityApp.entities.Organisation;
import ma.emsi.charityApp.repositories.OrganisationRepository;
import ma.emsi.charityApp.Service.OrganisationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganisationServiceImpl implements OrganisationService {

    private final OrganisationRepository organisationRepository;

    public OrganisationServiceImpl(OrganisationRepository organisationRepository) {
        this.organisationRepository = organisationRepository;
    }

    @Override
    public Organisation addOrganisation(Organisation organisation) {
        return organisationRepository.save(organisation);
    }

    @Override
    public Organisation editOrganisation(Organisation organisation) {
        return organisationRepository.save(organisation);
    }

    @Override
    public void deleteOrganisation(int id) {
        organisationRepository.deleteById((long) id);
    }

    @Override
    public Organisation getOrganisationById(int id) {
        return organisationRepository.findById((long) id).orElse(null);
    }

    @Override
    public List<Organisation> getAllOrganisations() {
        return (List<Organisation>) organisationRepository.findAll();
    }
}


package ma.emsi.charityApp.Service;

import ma.emsi.charityApp.entities.Organisation;

import java.util.List;

public interface OrganisationService {

    Organisation addOrganisation(Organisation organisation);

    Organisation editOrganisation(Organisation organisation);

    void deleteOrganisation(int id);

    Organisation getOrganisationById(int id);

    List<Organisation> getAllOrganisations();
}

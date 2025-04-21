package ma.emsi.charityApp.repositories;

import ma.emsi.charityApp.entities.Organisation;

import org.springframework.data.repository.CrudRepository;

public interface OrganisationRepository extends CrudRepository<Organisation, Long> {
}

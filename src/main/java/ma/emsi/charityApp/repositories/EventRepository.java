package ma.emsi.charityApp.repositories;

import ma.emsi.charityApp.entities.Event;


import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {
}

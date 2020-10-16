package br.com.devisis.personapi.repository;

import br.com.devisis.personapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository  extends JpaRepository<Person, Long> {
}

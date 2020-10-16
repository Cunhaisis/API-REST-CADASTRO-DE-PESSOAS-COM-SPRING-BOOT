package br.com.devisis.personapi.dto.mapper;

import br.com.devisis.personapi.dto.request.PersonDTO;
import br.com.devisis.personapi.entities.Person;
import org.springframework.web.bind.annotation.Mapping;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}

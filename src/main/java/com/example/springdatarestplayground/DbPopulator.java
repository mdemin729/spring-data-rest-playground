package com.example.springdatarestplayground;

import com.example.springdatarestplayground.model.Address;
import com.example.springdatarestplayground.model.Organization;
import com.example.springdatarestplayground.model.Person;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DbPopulator implements ApplicationRunner {

    private final PersonRepository personRepository;
    private final OrganizationRepository organizationRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Person person1 = Person.builder()
                .firstname("John")
                .lastname("Smith")
                .address(Address.builder()
                        .addressLine1("Flowers street, 1")
                        .addressLine2("")
                        .city("Lost city")
                        .state("")
                        .country("Laplandia")
                        .zipCode("123456")
                        .build())
                .build();
        personRepository.save(person1);

        Person person2 = Person.builder()
                .firstname("Bill")
                .lastname("Doe")
                .address(Address.builder()
                        .addressLine1("Flowers street, 2")
                        .addressLine2("")
                        .city("Lost city")
                        .state("")
                        .country("Laplandia")
                        .zipCode("123456")
                        .build())
                .build();
        personRepository.save(person2);

        Organization organization = Organization.builder()
                .name("Oracle")
                .address(Address.builder()
                        .addressLine1("100 Oracle Pkwy")
                        .addressLine2("")
                        .city("Redwood City")
                        .state("CA")
                        .country("USA")
                        .zipCode("94065")
                        .build())
                .build();
        organizationRepository.save(organization);

    }
}

package com.example.springdatarestplayground.validation;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

@Configuration
@RequiredArgsConstructor
public class PersonValidationConfiguration {

    private final javax.validation.Validator validator;

    @Bean
    public Validator beforeCreatePersonValidator() {
        return new SpringValidatorAdapter(validator);
    }

}

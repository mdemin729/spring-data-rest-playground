package com.example.springdatarestplayground.model;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Address {

    @NotNull
    @Size(max = 100)
    private String addressLine1;
    @NotNull
    @Size(max = 100)
    private String addressLine2;
    @NotNull
    @Size(max = 30)
    private String city;
    @NotNull
    @Size(max = 50)
    private String state;
    @Size(max = 50)
    private String country;
    @NotNull
    @Size(max = 6)
    private String zipCode;
}

package com.example.springdatarestplayground.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Organization {

    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    @Size(max = 100)
    private String name;
    @NotNull
    @Valid
    private Address address;
}

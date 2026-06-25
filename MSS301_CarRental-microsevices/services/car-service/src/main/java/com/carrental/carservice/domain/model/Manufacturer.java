package com.carrental.carservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Manufacturer {
    private Long manufacturerId;
    private String manufacturerName;
    private String description;
    private String manufacturerCountry;
}

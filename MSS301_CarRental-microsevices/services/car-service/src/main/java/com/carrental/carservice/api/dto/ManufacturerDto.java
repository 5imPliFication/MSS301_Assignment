package com.carrental.carservice.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ManufacturerDto {
    private Long manufacturerId;
    private String manufacturerName;
    private String description;
    private String manufacturerCountry;
}

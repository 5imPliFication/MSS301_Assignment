package com.carrental.rentingservice.api.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RentingDetailDto {
    private Long rentingTransactionId;
    private Long carId;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double price;
}

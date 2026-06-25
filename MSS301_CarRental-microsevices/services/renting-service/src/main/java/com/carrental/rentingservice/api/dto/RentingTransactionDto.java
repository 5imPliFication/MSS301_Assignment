package com.carrental.rentingservice.api.dto;

import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RentingTransactionDto {
    private Long rentingTransactionId;
    private LocalDate rentingDate;
    private Double totalPrice;
    private Long customerId;
    private String rentingStatus;
    private List<RentingDetailDto> rentingDetails;
}

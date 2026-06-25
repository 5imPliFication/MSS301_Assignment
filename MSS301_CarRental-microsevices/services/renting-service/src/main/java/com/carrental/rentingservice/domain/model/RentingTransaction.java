package com.carrental.rentingservice.domain.model;

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
public class RentingTransaction {
    private Long rentingTransactionId;
    private LocalDate rentingDate;
    private Double totalPrice;
    private Long customerId;
    private String rentingStatus;
    private List<RentingDetail> rentingDetails;
}

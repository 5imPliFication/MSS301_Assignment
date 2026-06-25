package com.carrental.rentingservice.infrastructure.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "renting_details")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RentingDetailEntity {
    
    @EmbeddedId
    private RentingDetailId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("rentingTransactionId")
    @JoinColumn(name = "renting_transaction_id")
    private RentingTransactionEntity rentingTransaction;

    private LocalDate startDate;
    private LocalDate endDate;
    private Double price;
}

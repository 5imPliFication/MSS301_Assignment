package com.carrental.rentingservice.infrastructure.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "renting_transactions")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RentingTransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rentingTransactionId;

    private LocalDate rentingDate;
    private Double totalPrice;
    
    // Customer ID only (from customer-service)
    private Long customerId;
    
    private String rentingStatus;

    @OneToMany(mappedBy = "rentingTransaction", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private List<RentingDetailEntity> rentingDetails = new ArrayList<>();
}

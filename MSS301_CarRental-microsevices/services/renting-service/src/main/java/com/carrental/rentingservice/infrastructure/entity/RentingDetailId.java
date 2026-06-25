package com.carrental.rentingservice.infrastructure.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RentingDetailId implements Serializable {
    @Column(name = "renting_transaction_id")
    private Long rentingTransactionId;

    @Column(name = "car_id")
    private Long carId;
}

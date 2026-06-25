package com.carrental.customerservice.api.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
    private Long customerId;
    private String customerName;
    private String telephone;
    private String email;
    private LocalDate customerBirthday;
    private String customerStatus;
    private String password;
}

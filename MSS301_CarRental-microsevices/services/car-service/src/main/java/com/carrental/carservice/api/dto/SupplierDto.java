package com.carrental.carservice.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SupplierDto {
    private Long supplierId;
    private String supplierName;
    private String supplierDescription;
    private String supplierAddress;
}

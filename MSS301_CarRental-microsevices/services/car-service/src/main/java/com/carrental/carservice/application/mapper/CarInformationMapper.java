package com.carrental.carservice.application.mapper;

import com.carrental.carservice.api.dto.CarInformationDto;
import com.carrental.carservice.domain.model.CarInformation;
import com.carrental.carservice.infrastructure.entity.CarInformationEntity;
import com.carrental.carservice.infrastructure.entity.ManufacturerEntity;
import com.carrental.carservice.infrastructure.entity.SupplierEntity;
import org.springframework.stereotype.Component;

@Component
public class CarInformationMapper {

    public CarInformation toDomain(CarInformationEntity entity) {
        return CarInformation.builder()
                .carId(entity.getCarId())
                .carName(entity.getCarName())
                .carDescription(entity.getCarDescription())
                .numberOfDoors(entity.getNumberOfDoors())
                .seatingCapacity(entity.getSeatingCapacity())
                .fuelType(entity.getFuelType())
                .year(entity.getYear())
                .manufacturerId(entity.getManufacturer() != null ? entity.getManufacturer().getManufacturerId() : null)
                .supplierId(entity.getSupplier() != null ? entity.getSupplier().getSupplierId() : null)
                .carStatus(entity.getCarStatus())
                .carRentingPricePerDay(entity.getCarRentingPricePerDay())
                .build();
    }

    public CarInformationEntity toEntity(CarInformation domain, ManufacturerEntity manufacturer, SupplierEntity supplier) {
        return CarInformationEntity.builder()
                .carId(domain.getCarId())
                .carName(domain.getCarName())
                .carDescription(domain.getCarDescription())
                .numberOfDoors(domain.getNumberOfDoors())
                .seatingCapacity(domain.getSeatingCapacity())
                .fuelType(domain.getFuelType())
                .year(domain.getYear())
                .manufacturer(manufacturer)
                .supplier(supplier)
                .carStatus(domain.getCarStatus())
                .carRentingPricePerDay(domain.getCarRentingPricePerDay())
                .build();
    }

    public CarInformationDto toDto(CarInformation domain) {
        return CarInformationDto.builder()
                .carName(domain.getCarName())
                .carDescription(domain.getCarDescription())
                .numberOfDoors(domain.getNumberOfDoors())
                .seatingCapacity(domain.getSeatingCapacity())
                .fuelType(domain.getFuelType())
                .year(domain.getYear())
                .manufacturerId(domain.getManufacturerId())
                .supplierId(domain.getSupplierId())
                .carStatus(domain.getCarStatus())
                .carRentingPricePerDay(domain.getCarRentingPricePerDay())
                .build();
    }

    public CarInformation toDomain(CarInformationDto dto) {
        return CarInformation.builder()
                .carName(dto.getCarName())
                .carDescription(dto.getCarDescription())
                .numberOfDoors(dto.getNumberOfDoors())
                .seatingCapacity(dto.getSeatingCapacity())
                .fuelType(dto.getFuelType())
                .year(dto.getYear())
                .manufacturerId(dto.getManufacturerId())
                .supplierId(dto.getSupplierId())
                .carStatus(dto.getCarStatus())
                .carRentingPricePerDay(dto.getCarRentingPricePerDay())
                .build();
    }
}

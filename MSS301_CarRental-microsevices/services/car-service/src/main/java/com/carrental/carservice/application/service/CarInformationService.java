package com.carrental.carservice.application.service;

import com.carrental.carservice.api.dto.CarInformationDto;
import com.carrental.carservice.application.mapper.CarInformationMapper;
import com.carrental.carservice.domain.model.CarInformation;
import com.carrental.carservice.infrastructure.entity.CarInformationEntity;
import com.carrental.carservice.infrastructure.entity.ManufacturerEntity;
import com.carrental.carservice.infrastructure.entity.SupplierEntity;
import com.carrental.carservice.infrastructure.repository.CarInformationRepository;
import com.carrental.carservice.infrastructure.repository.ManufacturerRepository;
import com.carrental.carservice.infrastructure.repository.SupplierRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarInformationService {
    private final CarInformationRepository carRepository;
    private final ManufacturerRepository manufacturerRepository;
    private final SupplierRepository supplierRepository;
    private final CarInformationMapper carMapper;

    public List<CarInformationDto> getAllCars() {
        return carRepository.findAll().stream()
                .map(carMapper::toDomain)
                .map(carMapper::toDto)
                .collect(Collectors.toList());
    }

    public CarInformationDto getCarById(Long id) {
        CarInformationEntity entity = carRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Car not found with id: " + id));
        return carMapper.toDto(carMapper.toDomain(entity));
    }

    public CarInformationDto createCar(CarInformationDto carDto) {
        CarInformation domain = carMapper.toDomain(carDto);
        ManufacturerEntity manufacturer = null;
        SupplierEntity supplier = null;

        if (domain.getManufacturerId() != null) {
            manufacturer = manufacturerRepository.findById(domain.getManufacturerId())
                    .orElseThrow(() -> new RuntimeException("Manufacturer not found"));
        }
        if (domain.getSupplierId() != null) {
            supplier = supplierRepository.findById(domain.getSupplierId())
                    .orElseThrow(() -> new RuntimeException("Supplier not found"));
        }

        CarInformationEntity entity = carMapper.toEntity(domain, manufacturer, supplier);
        CarInformationEntity saved = carRepository.save(entity);
        return carMapper.toDto(carMapper.toDomain(saved));
    }

    public CarInformationDto updateCar(Long id, CarInformationDto carDto) {
        CarInformationEntity entity = carRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Car not found with id: " + id));

        entity.setCarName(carDto.getCarName());
        entity.setCarDescription(carDto.getCarDescription());
        entity.setNumberOfDoors(carDto.getNumberOfDoors());
        entity.setSeatingCapacity(carDto.getSeatingCapacity());
        entity.setFuelType(carDto.getFuelType());
        entity.setYear(carDto.getYear());
        entity.setCarStatus(carDto.getCarStatus());
        entity.setCarRentingPricePerDay(carDto.getCarRentingPricePerDay());

        if (carDto.getManufacturerId() != null) {
            ManufacturerEntity manufacturer = manufacturerRepository.findById(carDto.getManufacturerId())
                    .orElseThrow(() -> new RuntimeException("Manufacturer not found"));
            entity.setManufacturer(manufacturer);
        } else {
            entity.setManufacturer(null);
        }

        if (carDto.getSupplierId() != null) {
            SupplierEntity supplier = supplierRepository.findById(carDto.getSupplierId())
                    .orElseThrow(() -> new RuntimeException("Supplier not found"));
            entity.setSupplier(supplier);
        } else {
            entity.setSupplier(null);
        }

        CarInformationEntity saved = carRepository.save(entity);
        return carMapper.toDto(carMapper.toDomain(saved));
    }

    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}

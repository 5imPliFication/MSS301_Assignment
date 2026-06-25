package com.carrental.carservice.infrastructure.repository;

import com.carrental.carservice.infrastructure.entity.CarInformationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarInformationRepository extends JpaRepository<CarInformationEntity, Long> {
}

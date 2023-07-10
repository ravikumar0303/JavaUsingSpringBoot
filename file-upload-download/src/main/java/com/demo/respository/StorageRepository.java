package com.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.ImageData;

import java.util.Optional;

public interface StorageRepository extends JpaRepository<ImageData,Long> {


    Optional<ImageData> findByName(String fileName);
}

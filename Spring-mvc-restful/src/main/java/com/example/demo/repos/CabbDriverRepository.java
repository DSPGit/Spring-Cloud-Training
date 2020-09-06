package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Driver;

public interface CabbDriverRepository extends JpaRepository<Driver, Integer>{

}

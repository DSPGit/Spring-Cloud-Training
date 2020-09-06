package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Driver;
import com.example.demo.repos.CabbDriverRepository;

@Service
public class CabDriverService {

	@Autowired
	private CabbDriverRepository repo;

	public List<Driver> getAllDrivers() {
		return this.repo.findAll();
	}

}

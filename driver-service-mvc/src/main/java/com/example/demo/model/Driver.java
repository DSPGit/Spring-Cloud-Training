package com.example.demo.model;

import org.hibernate.validator.constraints.Length;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)
public class Driver {

	int driverId;
	@Length(max = 10, min = 3)
	String driverName;
	long mobNo;
	Address address;
	String location;
}

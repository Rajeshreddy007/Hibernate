package com.Associations;

import jakarta.persistence.*;

@Entity
public class Vehicle {

	@Id
	private int vehicleId;

	private String type;

	@OneToOne
	private Driver driver;

	public Vehicle() {
		System.out.println("Vehicle Class Constructor");

	}

	// Getters and Setters

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", type=" + type + ", driver=" + driver + "]";
	}

}
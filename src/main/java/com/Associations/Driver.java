package com.Associations;

import jakarta.persistence.*;

@Entity
public class Driver {

	@Id
	private int driverId;

	private String name;

	@OneToOne
	@JoinColumn(name = "vehicle_id")
	private Vehicle vehicle;

	public Driver() {
		System.out.println("Driver Class Constructor");
	}

	// Getters and Setters

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Driver{id=" + driverId + ", name='" + name + "', vehicle=" + vehicle + "}";
	}
}

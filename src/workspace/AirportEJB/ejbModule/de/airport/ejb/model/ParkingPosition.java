package de.airport.ejb.model;

import javax.persistence.GeneratedValue;


@javax.persistence.Entity(name = "parkingposition")
public class ParkingPosition {
	@javax.persistence.Id
	@GeneratedValue
	private int id;
	
	private boolean isFree;
	
	public ParkingPosition() {
		super();
		this.isFree = true;
	}

	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

	public int getId() {
		return id;
	}

	

}

package de.airport.ejb.model;

import javax.persistence.GeneratedValue;


@javax.persistence.Entity(name = "parkingposition")
public class ParkingPosition {
	@javax.persistence.Id
	@GeneratedValue
	private final int id;
	private boolean isFree;
	
	public ParkingPosition() {
		super();
		this.id = 9;
		this.isFree = true;
	}
	
	public ParkingPosition(int id) {
		super();
		this.id = id;
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

package de.airport.ejb.model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@javax.persistence.Entity(name = "airplane")
public class Airplane {
	@javax.persistence.Id
	@javax.persistence.GeneratedValue
	private int id;

	private final String name;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "aircraftCollection")
	private Airline airline;

	@Enumerated(EnumType.STRING)
	private StartingDirection startingdirection;
	// private Runway runway;
	
	@OneToOne(mappedBy="airplane")
	private ParkingPosition parkingPosition;
	
	@Enumerated(EnumType.STRING)
	private AirplaneState state;

	public Airplane() {
		super();
		this.name = "unknown";
		System.err.println("Airline-Default-Constr. executed");
	}

	public Airplane(String name) {
		super();
		this.name = name;
	}
	
	public ParkingPosition getParkingPosition() {
		return parkingPosition;
	}

	public void setParkingPosition(ParkingPosition parkingPosition) {
		this.parkingPosition = parkingPosition;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}

	public String getAirlineName() {

		return airline.getName();
	}

	public AirplaneState getState() {
		return state;
	}

	public void setState(AirplaneState state) {
		this.state = state;
	}

	public void startAircraft() {
		// TODO: start the aircraft
	}

	public StartingDirection getStartingdirection() {
		return startingdirection;
	}

	public void setStartingdirection(StartingDirection startingdirection) {
		this.startingdirection = startingdirection;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	

}

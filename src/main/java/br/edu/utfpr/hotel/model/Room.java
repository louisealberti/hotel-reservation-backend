package br.edu.utfpr.hotel.model;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "room")
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private int number;

	@Column(nullable = false)
	private String type;

	@Column
	private LocalDate arrival;

	@Column
	private LocalDate departure;

	public Room() {

	}

	public Room(Long id, int number, String type, LocalDate arrival, LocalDate departure) {
		this.id = id;
		this.number = number;
		this.type = type;
		this.arrival = arrival;
		this.departure = departure;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getArrival() {
		return arrival;
	}

	public void setArrival(LocalDate arrival) {
		this.arrival = arrival;
	}

	public LocalDate getDeparture() {
		return departure;
	}

	public void setDeparture(LocalDate departure) {
		this.departure = departure;
	}

}

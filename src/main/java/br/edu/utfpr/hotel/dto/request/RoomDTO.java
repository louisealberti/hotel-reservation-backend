package br.edu.utfpr.hotel.dto.request;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;

public class RoomDTO {

	private Long id;

	private int number;

	@NotEmpty
	private String type;

	private LocalDate arrival;

	private LocalDate departure;

	public RoomDTO() {

	}

	public RoomDTO(Long id, int number, @NotEmpty String type, LocalDate arrival,
			LocalDate departure) {
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

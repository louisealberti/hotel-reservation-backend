package br.edu.utfpr.hotel.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import br.edu.utfpr.hotel.model.Room;

public class CustomerDTO {

	private Long id;

	@NotEmpty
	@Size(min = 2, max = 50)
	private String firstName;

	@NotEmpty
	@Size(min = 2, max = 50)
	private String lastName;

	@NotEmpty
	@CPF
	private String cpf;

	@NotEmpty
	@Size(min = 7, max = 30)
	private String email;

	@NotEmpty
	@Size(min = 13, max = 20)
	private String phone;

	@NotEmpty
	@Size(min = 10, max = 50)
	private String address;

	@NotEmpty
	@Size(min = 8, max = 64)
	private String password;

	private Room room;

	public CustomerDTO() {

	}

	public CustomerDTO(Long id, @NotEmpty @Size(min = 2, max = 50) String firstName,
			@NotEmpty @Size(min = 2, max = 50) String lastName, @NotEmpty @CPF String cpf,
			@NotEmpty @Size(min = 7, max = 30) String email, @NotEmpty @Size(min = 13, max = 20) String phone,
			@NotEmpty @Size(min = 10, max = 50) String address, @NotEmpty @Size(min = 8, max = 64) String password,
			Room room) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.cpf = cpf;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.password = password;
		this.room = room;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

}

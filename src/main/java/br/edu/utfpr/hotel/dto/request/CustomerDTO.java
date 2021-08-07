package br.edu.utfpr.hotel.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

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
	private String email;

	@NotEmpty
	private String phone;

	@NotEmpty
	private String address;

	@NotEmpty
	@Size(min = 8, max = 64)
	private String password;

	private double bill;

	public CustomerDTO() {

	}

	public CustomerDTO(Long id, @NotEmpty @Size(min = 2, max = 50) String firstName,
			@NotEmpty @Size(min = 2, max = 50) String lastName, @NotEmpty @CPF String cpf, @NotEmpty String email,
			@NotEmpty String phone, @NotEmpty String address, @NotEmpty @Size(min = 8, max = 64) String password,
			double bill) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.cpf = cpf;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.password = password;
		this.bill = bill;
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

	public double getBill() {
		return bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}
}

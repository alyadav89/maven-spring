package com.maven.rest.model;

public class Employee {

	private Long id;
	private String name;
	private String address;
	private String companyName;
	private Long contactDetails;

	public Employee() {

	}

	public Employee(Long id, String name, String address, String companyName, Long contactDetails) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.companyName = companyName;
		this.contactDetails = contactDetails;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Long getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(Long contactDetails) {
		this.contactDetails = contactDetails;
	}
}

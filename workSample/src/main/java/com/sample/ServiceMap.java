package com.sample;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceMap {

	private String organization;
	private String department;
	private String unit_connection;
	private String service;
	private String unit;
	private String search;
	private String accessibility_rule;
	private String administrative_division;
	private String address;
	private String administrative_division_type;
	private String street;
	private String observation;
	
	public ServiceMap() {
	}
	
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getUnit_connection() {
		return unit_connection;
	}
	public void setUnit_connection(String unit_connection) {
		this.unit_connection = unit_connection;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public String getAccessibility_rule() {
		return accessibility_rule;
	}
	public void setAccessibility_rule(String accessibility_rule) {
		this.accessibility_rule = accessibility_rule;
	}
	public String getAdministrative_division() {
		return administrative_division;
	}
	public void setAdministrative_division(String administrative_division) {
		this.administrative_division = administrative_division;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAdministrative_division_type() {
		return administrative_division_type;
	}
	public void setAdministrative_division_type(String administrative_division_type) {
		this.administrative_division_type = administrative_division_type;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	
}

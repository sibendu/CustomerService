package crm;  

import java.io.Serializable;

public class Customer implements Serializable {

	private String firstName;
	private String lastName;
	private Integer age;
	private Double income;
	
	public Customer() {
		super();
	}
	public Customer(String firstName, String lastName, Integer age, Double income) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.income = income;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getIncome() {
		return income;
	}
	public void setIncome(Double income) {
		this.income = income;
	}
	
	
		
}

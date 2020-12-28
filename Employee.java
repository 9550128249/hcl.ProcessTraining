package org.hcl.collections;
import java.util.ArrayList;
public class Employee {
private String EmployeeName;
public ArrayList<String>employeeMobileNumber;
private Long employeeSalary ;
private String employeeEmail ;
private Address address ;
public Employee() {
	// TODO Auto-generated constructor stub
}
public String getEmployeeName() {
	return EmployeeName;
}
public void setEmployeeName(String employeeName) {
	EmployeeName = employeeName;
}
public ArrayList<String> getEmployeeMobileNumber() {
	return employeeMobileNumber;
}
public void setEmployeeMobileNumber(ArrayList<String> employeeMobileNumber) {
	this.employeeMobileNumber = employeeMobileNumber;
}
public Long getEmployeeSalary() {
	return employeeSalary;
}
public void setEmployeeSalary(Long employeeSalary) {
	this.employeeSalary = employeeSalary;
}
public String getEmployeeEmail() {
	return employeeEmail;
}
public void setEmployeeEmail(String employeeEmail) {
	this.employeeEmail = employeeEmail;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public Employee(String employeeName, ArrayList<String> employeeMobileNumber, Long employeeSalary, String employeeEmail,
		Address address) {
	super();
	EmployeeName = employeeName;
	this.employeeMobileNumber = employeeMobileNumber;
	this.employeeSalary = employeeSalary;
	this.employeeEmail = employeeEmail;
	this.address = address;
}
public void display()
{
	System.out.println("name"+"\t"+"the contact numbers are:employeeMobileNumber"+"\t"+"salary"+"\t"+"employeeEmail");
}
}

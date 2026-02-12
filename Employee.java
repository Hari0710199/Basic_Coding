package com.java.example;

import java.io.Serializable;
import java.util.Objects;

//comparable is present in java.lang package
public class Employee implements Serializable, Comparable<Employee> {

	private static final long serialVersionUID = 24352345;

	private int id;
	private String name;
	private String address;
	private boolean isMaster;
	private int salary;

	public Employee() {
	}

	public Employee(String name, String address, int id, boolean isMaster, int salary) {
		this.name = name;
		this.address = address;
		this.id = id;
		this.isMaster = isMaster;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getId() {
		return id;
	}

	public boolean isMaster() {
		return isMaster;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMaster(boolean master) {
		isMaster = master;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Employee employee))
			return false;
		return id == employee.id && isMaster == employee.isMaster && salary == employee.salary
				&& Objects.equals(name, employee.name) && Objects.equals(address, employee.address);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, address, id, isMaster, salary);
	}

	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", address='" + address + '\'' + ", id=" + id + ", isMaster="
				+ isMaster + ", salary=" + salary + '}';
	}

	@Override // -1 , 0, 1
	public int compareTo(Employee employeeUsingComparable) {
		if (employeeUsingComparable == null)
			return 1;
		return Integer.compare(this.getId(), employeeUsingComparable.getId());
	}

}
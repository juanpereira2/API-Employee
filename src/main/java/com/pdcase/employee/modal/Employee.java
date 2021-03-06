package com.pdcase.employee.modal;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String role;
	private Integer age; 
	
	 Employee() {}
	 
	 public Employee(String name, String role){
		 this.name = name;
		 this.role= role;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	  public boolean equals(Object o) {

	    if (this == o)
	      return true;
	    if (!(o instanceof Employee))
	      return false;
	    Employee employee = (Employee) o;
	    return Objects.equals(this.id, employee.id) && Objects.equals(this.name, employee.name)
	        && Objects.equals(this.role, employee.role) && Objects.equals(this.age, employee.age);
	  }
	 @Override
	 public int hashCode() {
		 return Objects.hash(this.id,this.name,this.role,this.age);
	 }
	 @Override
	  public String toString() {
	    return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.role + '\'' + '}';
	  }	 
}
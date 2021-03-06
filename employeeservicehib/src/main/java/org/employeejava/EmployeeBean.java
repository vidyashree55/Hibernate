package org.employeejava;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class EmployeeBean implements Serializable
{
	
	 public EmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	 @Id
	 @GeneratedValue( strategy = GenerationType.AUTO )
	int id;
		public EmployeeBean( String name, double salary) {
		super();
		
		this.name = name;
		this.salary = salary;
	}
		String name;
		double salary;
		
		@ManyToOne
		   @JoinColumn( name = "DEPARTMENT_ID" )
		   private DepartmentBean  department; // mappedBy
		
	public DepartmentBean getDepartment() {
			return department;
		}
		public void setDepartment(DepartmentBean department) {
			this.department = department;
			this.department.getMembers().add(this);
		}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

	
	
}

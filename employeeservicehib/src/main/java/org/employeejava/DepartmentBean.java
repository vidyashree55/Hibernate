package org.employeejava;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class DepartmentBean


{
	@Id
	 @GeneratedValue( strategy = GenerationType.AUTO )
	private int id;
	private String name;
	 @OneToMany( mappedBy = "department" )
	private Collection<EmployeeBean> members = new ArrayList<EmployeeBean>();
	
	public Collection<EmployeeBean> getMembers() {
		return members;
	}
	public void setMembers(Collection<EmployeeBean> members) {
		this.members = members;
	}
	public DepartmentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DepartmentBean(String name) {
		super();
	
		this.name = name;
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
	@Override
	public String toString() {
		return "DepartmentBean [id=" + id + ", name=" + name + "]";
	}
	
	
	
}

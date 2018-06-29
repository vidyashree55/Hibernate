package org.employeejava;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;

public class SampleService {

	public void someBusinessMethod()
	{
		//actual wont use hardcoded parameters
		  Session session = HibUtil.getSessionfactory().openSession();
		  try
		  {
			  session.beginTransaction();
		      CrudDao<EmployeeBean> employeeDao = new CrudDao<EmployeeBean>(session);
		      CrudDao<DepartmentBean> deptDao = new CrudDao<DepartmentBean>(session);
		      
		      EmployeeBean vidya = new EmployeeBean("Vidya", 1234);
		      DepartmentBean dept = new DepartmentBean( "java");
		      vidya.setDepartment(dept);
		      employeeDao.add(vidya);
		      
		      deptDao.add(dept);
		            
		}
		  finally
		  {
			  session.getTransaction().commit();
				
		  }
	      
	     
		
	}
}

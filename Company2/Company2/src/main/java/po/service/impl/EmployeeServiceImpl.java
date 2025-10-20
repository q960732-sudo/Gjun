package po.service.impl;

import java.util.List;

import po.Employee;
import po.dao.impl.EmployeeDaoImpl;
import po.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

	public static void main(String[] args) {
		new EmployeeServiceImpl().addEmployee(new Employee("e004","a","taipei"));
	}

	private static EmployeeDaoImpl em=new EmployeeDaoImpl();
	
	@Override
	public void addEmployee(Employee employee) {
		em.add(employee);
		
	}

	@Override
	public List<Employee> findAllEmployee() {
		// TODO Auto-generated method stub
		return em.selectAll();
	}

}

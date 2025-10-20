package po.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import po.Employee;
import po.dao.EmployeeDao;
import util.DbConnection;

public class EmployeeDaoImpl implements EmployeeDao{

	public static void main(String[] args) {
	//	Employee em=new Employee("e003","abc","taipei");
		//new EmployeeDaoImpl().add(em);
		
		//System.out.println(new EmployeeDaoImpl().selectAll());
		
		//System.out.println(new EmployeeDaoImpl().selectById(1));
//		Employee employee=new EmployeeDaoImpl().selectById(4) ;
//		employee.setName("allen");
//		employee.setAddress("高雄");
//		
//		new EmployeeDaoImpl().update(employee);
		
		
	//	new EmployeeDaoImpl().delete(4);

	}
	
	private Connection conn=DbConnection.getDb();

	@Override
	public void add(Employee employee) {
		String sql="insert into employee(employeeno,name,address) values(?,?,?)";
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, employee.getEmployeeNo());
			ps.setString(2, employee.getName());
			ps.setString(3, employee.getAddress());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Employee> selectAll() {
		String sql="select * from employee";
		List<Employee> list=new ArrayList();
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Employee em=new Employee();
				em.setId(rs.getInt("id"));
				em.setName(rs.getString("name"));
				em.setEmployeeNo(rs.getString("employeeno"));
				em.setAddress(rs.getString("address"));
				
				list.add(em);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Employee selectById(int id) {
		String sql="select * from employee where id=?";
		Employee employee=null;
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				employee=new Employee();
				employee.setId(rs.getInt("id"));
				employee.setName(rs.getString("name"));
				employee.setEmployeeNo(rs.getString("employeeno"));
				employee.setAddress(rs.getString("address"));
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employee;
	}

	@Override
	public void update(Employee employee) {
		String sql="update employee set name=?,address=? where id=?";
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, employee.getName());
			ps.setString(2, employee.getAddress());
			ps.setInt(3, employee.getId());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {
		String sql="delete from employee where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

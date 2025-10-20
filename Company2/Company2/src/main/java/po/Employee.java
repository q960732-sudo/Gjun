package po;

public class Employee {
	private int id;
	private String employeeNo;
	private String name;
	private String address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeeNo, String name, String address) {
		super();
		this.employeeNo = employeeNo;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}

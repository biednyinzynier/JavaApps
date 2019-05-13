package designpatterns.creatpatterns.prototype;

public class EmployeeRecord implements Prototype {
	
	private int id;
	private String name,job,address;
	private double salary;
	
	public EmployeeRecord() {
		System.out.println(" Employee Records of Company ");
		System.out.println("----------------------------");
		System.out.println("Id\tName\tJobDe\tSalary\tAddress");
	}
	
	public EmployeeRecord(int id, String name, String job, double salary, String address) {
		this();
		this.id = id;
		this.name = name;
		this.job = job;
		this.address = address;
		this.salary = salary;
	}
	
	public void showRecord() {
		System.out.println(id + "\t" + name + "\t" + job + "\t" + salary + "\t" + address);
	}


	@Override
	public Prototype Clone() {
		return new EmployeeRecord(id, name, job, salary, address);
	}

}

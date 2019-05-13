package designpatterns.creatpatterns.prototype;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter employee id: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("Enter employee name: ");
		String name = scanner.nextLine();
		
		System.out.print("Enter employee job: ");
		String job = scanner.nextLine();
		
		System.out.print("Enter employee salary: ");
		double salary = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.print("Enter the address: ");
		String address = scanner.nextLine();
		
		EmployeeRecord record = new EmployeeRecord(id, name, job, salary, address);
		record.showRecord();
		
		EmployeeRecord record2 = (EmployeeRecord)record.Clone();
		record2.showRecord();
	}

}

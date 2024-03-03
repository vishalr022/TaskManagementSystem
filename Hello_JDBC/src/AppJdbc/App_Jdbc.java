package AppJdbc;

import java.util.ArrayList;
import java.util.Scanner;

public class App_Jdbc {

	public static void main(String[] args) throws Exception {
		while(true) {
			System.out.println(" EMPLOYEE MANAGMENT");
			System.out.println("1=create ,2= read,3=delete ,4=update");
			Scanner sc= new Scanner(System.in);
			int choise = sc.nextInt();
			
			
			if (choise <1 || choise >= 5 ) break;
			
			switch(choise) {
	case 1:
			System.out.println("id,name,email,Salary");
			int id=sc.nextInt();
			sc.nextLine();
			String name   = sc.nextLine();
			String email  = sc.nextLine();
			int salary = sc.nextInt();
			
			Employee em= new Employee(id ,name,email,salary);
			EmployeeDao.createEmployee(em);
			break;
	case 2:	
			ArrayList<Employee> list = EmployeeDao.readAllEmployee();
			for(Employee employee :list) {
				System.out.println(employee);
			}
			break;
	case 3:
		
		System.out.print("id , name");
		id = sc.nextInt();
		sc.nextLine();
		name= sc.nextLine();
		EmployeeDao.updateEmployee(id,name);
		break;
			
	case 4:
		
		System.out.print("id");
		id = sc.nextInt();
		EmployeeDao.deleteEmployee(id);
		break;
			}
			
		}

	}

}

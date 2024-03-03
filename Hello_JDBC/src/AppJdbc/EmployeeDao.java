package AppJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeDao {
	public	static void createEmployee(Employee employee) throws SQLException{
		Connection con = Db.connect();

   	 //Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Vishal@123");
		System.out.println("DB connected");
		String query= Query.insert;
		System.out.println("Data Inserted successfully");
		PreparedStatement manjeet = con.prepareStatement(query);

		manjeet.setInt   (1, employee.getId());
		manjeet.setString(2, employee.getName());
		manjeet.setString(3, employee.getEmail());
		manjeet.setInt   (4, employee.getSalary());
		
		System.out.println("\n ps = " +manjeet+"\n");
		manjeet.executeUpdate();
		manjeet.close();

	
}
	public	static void updateEmployee(int id, String name) throws SQLException{
		Connection con = Db.connect();
		String query= Query.update;
		PreparedStatement preparedStatement = con.prepareStatement(query);

		preparedStatement.setInt(2, id);
		preparedStatement.setString(1, name);
		
		System.out.println("\n ps = "+preparedStatement+"\n");
		preparedStatement.executeUpdate();
		preparedStatement.close();
}
	
	public static ArrayList readAllEmployee() throws SQLException{
		
		ArrayList< Employee> enlist = new ArrayList<Employee>();
		Connection conn= Db.connect();
		System.out.println("DB connected");
		String query= Query.select;
		Statement statement = conn.prepareStatement(query);
		
		System.out.println("\n st = "+statement);
		ResultSet rs = statement.executeQuery(query);
		
		while (rs.next() ){
			Employee emp= new Employee(rs.getInt (1), rs.getString(2) , rs.getString(3) , rs.getInt (4));
			enlist.add(emp);
		}
		statement.close();
		return enlist;	
	}
	


public static void deleteEmployee(int id) throws SQLException{}
}
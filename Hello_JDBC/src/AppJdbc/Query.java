package AppJdbc;

public class Query {

	public static String insert ="INSERT INTO employeeData VALUES (?,?,?,?)";
	public static String update ="UPDATE employeeData SET name = ? WHERE id = ?";
	public static String delete ="DELETE FROM employeeData WHERE id = ?";
	public static String select ="SELECT * FROM employeeData";

}
 
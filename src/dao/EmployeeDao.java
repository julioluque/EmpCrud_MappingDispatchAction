package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeeDao {

	public int save(int id, String name, String email, float salary) throws Exception {

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XEPDB", "system", "password");
		
		PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setFloat(4, salary);
		int i = ps.executeUpdate();
		return i;
	}
	
	public int update(int id, String name, String email, float salary) throws Exception {

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XEPDB", "system", "password");

		PreparedStatement ps = con.prepareStatement("update employee set name=?, email=?, salary=?, where id=?");
		ps.setString(1, name);
		ps.setString(2, email);
		ps.setFloat(3, salary);
		ps.setInt(4, id);
		
		int i = ps.executeUpdate();

		return i;
	}
}

import java.sql.*;

public class EmpDao {
public static Connection getConnection() {
	Connection con = null;
	
	try {
		Class.forName("com.mysqli.jdbc.Driver");
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}

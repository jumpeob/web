package jwc.db.cons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	public static Connection open() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe","jtest","ezen1234");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return con;
	}
	public static void close(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con = DBConnector.open();
		DBConnector.close(con);
	}
}

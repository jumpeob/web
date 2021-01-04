package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUserInfo {
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe","jtest","ezen1234");
			Statement stmt = con.createStatement();

			
			String sql = "INSERT INTO USER_INFO (ui_num,ui_name,ui_id,ui_pwd)";
			sql += "VALUES (1, '홍길동','hong','hong')";

			String sql1 = "INSERT INTO USER_INFO (ui_num,ui_name,ui_id,ui_pwd)";
			sql1 += "VALUES (2, '김길동','kim','kim')";
			
			String sql2 = "INSERT INTO USER_INFO (ui_num,ui_name,ui_id,ui_pwd)";
			sql2 += "VALUES (3, '오길동','oh','oh')";
			
			stmt.executeUpdate(sql);
			stmt.executeUpdate(sql1);
			stmt.executeUpdate(sql2);
			con.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectUserInfo {

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
			String sql = "select * from user_info";
			stmt.executeQuery(sql); // 얘는 업데이트가 아니라 쿼리임
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getString("ui_num")+",");
				System.out.print(rs.getString("ui_name")+",");
				System.out.print(rs.getString("ui_id")+",");
				System.out.println(rs.getString("ui_pwd"));
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

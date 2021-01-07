package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteBhcMenu {

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
			String sql ="delete from bhc_menu";
			sql+= " where bm_num = 3";
			int result = stmt.executeUpdate(sql);
			System.out.println(result+"개 삭제");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
}

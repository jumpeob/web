package test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserInfoSelect{

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
					ResultSet rs = stmt.executeQuery(sql);
					while(rs.next()){
						String str = rs.getString("ui_num")+",";
						str+=rs.getString("ui_name")+",";
						str+=rs.getString("ui_age");
						System.out.println(str);
					}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//------------------------------------------------------------------
		public static void main(String[] args) {
			try {Class.forName("oracle.jdbc.OracleDriver");} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}
			try {Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","jtest","ezen1234");
				Statement stmt = con.createStatement();String sql = "insert into user_info(ui_num,ui_name,ui_age)";int result = stmt.executeUpdate(sql+"values(1,'홍길동',3)");
						result += stmt.executeUpdate(sql+"values(2,'선우길동',4)");
						result += stmt.executeUpdate(sql+"values(3,'남궁길동',5)");
						result += stmt.executeUpdate(sql+"values(4,'제갈길동',6)");
						System.out.println(result+"개 인설트");
						
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
//		-------------------------------------------------------------
		
		public static void main(String[] args) {
			try {Class.forName("oracle.jdbc.OracleDriver");} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}
			try {Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","jtest","ezen1234");
				Statement stmt = con.createStatement();
				String sql = "update user_info"; 
						sql+= " set ui_name = '변동성'";
						sql+= " where ui_num = 1";
				int result = stmt.executeUpdate(sql);
						System.out.println(result+"업데이트");
						
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//--------------------------------------------------------
		public static void main(String[] args) {
			try {Class.forName("oracle.jdbc.OracleDriver");} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}
			try {Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","jtest","ezen1234");
				Statement stmt = con.createStatement();
				String sql = "delete user_info"; 
						
						sql+= " where ui_num = 4";
				int result = stmt.executeUpdate(sql);
						System.out.println(result+"삭제");
						
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

}
		
		
	


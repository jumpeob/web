package test2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentInfoController {
	
	public static void main(String[] args) {
		
		DBConnectionTest.loadDriver();
		Connection con = DBConnectionTest.getConnection();
		try {
			Statement stmt = con.createStatement();
			String sql = "create table student2_info(";
			sql += "si_num number(5,0) not null,";
			sql+= "si_name varchar2(30) not null, si_etc varchar2(100))";
			int result = stmt.executeUpdate(sql);
			System.out.println(result+"개 만들었습니다");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		// ----------------------여기까지 크리에이트---------------
		
		try {
			Statement stmt = con.createStatement();
			String sql = "insert into student2_info(si_num,si_name,si_etc)";
			int result = stmt.executeUpdate(sql+"values(1,'홍길동','육군')");
			result += stmt.executeUpdate(sql+"values(2,'김길동','육군')");
			result += stmt.executeUpdate(sql+"values(3,'박길동','육군')");
			result += stmt.executeUpdate(sql+"values(4,'제갈길동','육군')");
			System.out.println(result+"개 인설트");
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		
		// ----------------------여기까지 인설트 ----------------------
		

		try {
			Statement stmt = con.createStatement();
			String sql = "update student2_info";
			sql += " set si_name = '남궁길동',";
			sql += " si_etc = '특수부대'";
			sql += " where si_num = 3";
			int result = stmt.executeUpdate(sql);
			
			System.out.println(result+"개 업데이트");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		//-----------------------여기까지update-----------------------
		

		try {
			Statement stmt = con.createStatement();
			String sql ="delete from student2_info";
			sql+= " where si_num=4";
			int result=stmt.executeUpdate(sql);
			System.out.println(result+"개 삭제되었습니다");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} 
		
		//---------------------여기까지delete------------------------
		

		try {
			Statement stmt = con.createStatement();
			String sql = "select * from student2_info";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String str = rs.getString("si_num")+",";
				str+= rs.getString("si_name")+",";
				str+= rs.getString("si_etc")+",";
				System.out.println(str);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}DBConnectionTest.close(con);
	
		//--------------------여기까지 select-------------------
	}
}

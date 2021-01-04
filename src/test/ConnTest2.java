package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class ConnTest2 {

	public static void main(String[] args) {
		//단위테스트
		// TDD 개발방법론 : Test Driven Development 테스트 주도 개발
		/*
		 * DDL : Data Definition Language 데이터의 구조를 정의하는 언어
		 * 		CREATE, DROP, ALTER, TRUNCATE
		 * DML : Data Manipulation Language 데이터를 조작하는 언어
		 * 		INSERT UPDATE DELETE SELECT
		 * DCL : Data Control Language 데이터를 제어하는 언어
		 * 		GRANT REVOKE -->권한 주고 뺏는거 COMMIT ROLLBACK 
		 * TCL : Transaction Control Language 트렌젝션 제어하는 언어
		 * 		COMMIT ROLLBACK --> DCL로 설명하는 책들이 많음
		 */
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
			/*
			 * si_name = 동전한닢
			 * si_singer = 다듀
			 * si_genre = 히팝
			 * si_creadat = 20070531
			 */
			String sql = "update song_info";
			sql += " set si_name='동전한닢',"; // 업데이트 다음에 바로붙기때문에 띄어쓰기 해야함
			sql += "si_singer='다이네믹듀오',";
			sql += "si_genre='히팝',";
			sql += "si_creadat='20070531'";
			int result = stmt.executeUpdate(sql);
			System.out.println(result + "개 update되었음");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

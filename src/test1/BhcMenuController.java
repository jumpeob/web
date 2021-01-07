package test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BhcMenuController {

	public static void main(String[] args) {
		/*
		 * bm_num, bm_name, bm_type, bm_price, bm_desc 
		 * 입력받아서 bhc_menu table에 insert하는 프로그램을 완성
		 */
		System.out.println("추가할 메뉴번호, 메뉴명, 메뉴타입, 메뉴가격, 메뉴설명을 입력해주세요");
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴번호 :");
		int num = Integer.parseInt(scan.nextLine());
		
		System.out.println("메뉴명 :");
		String name = "'"+scan.nextLine()+"'";
		
		System.out.println("메뉴타입 :");
		String type = "'"+scan.nextLine()+"'";
		
		System.out.println("메뉴가격 :");
		int price = Integer.parseInt(scan.nextLine());
		
		System.out.println("메뉴설명 :");
		String desc = "'"+scan.nextLine()+"'";
		
		
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
			String sql = "insert into bhc_menu(bm_num,bm_name,bm_type,bm_price,bm_desc)";
			sql+="values("+ num +","+ name +","+ type +","+ price +","+ desc +")";
			int result = stmt.executeUpdate(sql);
			
			
				System.out.println(result+"개 인설트");
				
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

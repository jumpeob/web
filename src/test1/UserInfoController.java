package test1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserInfoController {

	public static void main(String[] args) {
		Connection con = DBConn.getConn();
		
		System.out.println("유저넘버, 유저네임, 유저아이디, 유저패스워드를 입력해주세요");
		Scanner scan = new Scanner(System.in);
		System.out.println("ui_num을 입력해주세요");
		String num = scan.nextLine();
		System.out.println("ui_name을 입력해주세요");
		String name = scan.nextLine();
		System.out.println("ui_id을 입력해주세요");
		String id = scan.nextLine();
		System.out.println("ui_pwd을 입력해주세요");
		String pwd = scan.nextLine();
		
		try {
			Statement stmt = con.createStatement();
			String sql = "insert into user_info(ui_num,ui_name,ui_id,ui_pwd)";
			sql+= "values("+num+",'"+name+"','"+id+"','"+pwd+"')";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println(rs+"개 등록되었습니다");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

package test1;

import java.util.Scanner;

public class WhilTest {

	public static void main(String[] args) {
		System.out.println("======================");
		System.out.println("   안녕하세요. 환영합니다");
		System.out.println("======================");
		System.out.println("원하시는 메뉴를 입력해주세요.");
		System.out.println("가입(1), 로그인(2), 종료(x)");
		Scanner scan = new Scanner(System.in);
		String cmd = "";
		while(!"x".equals(cmd)){ //!붙이면 부정연산자
			System.out.print("입력 : ");
			cmd = scan.nextLine();	
			switch(cmd) {
				case "1": System.out.println("가입 메뉴로 이동합니다");
				break;
				case "2": System.out.println("로그인 메뉴로 이동합니다");
				break;
				case "x" : System.out.println("시스템이 종료됩니다");
				break;
				default : System.out.println("메뉴를 잘못 누르셨습니다. 다시눌러주세요");
			}
		}	
	}
}

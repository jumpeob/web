package test1;

import java.util.Scanner;

public class SelfTest {

	public static void main(String[] args) {
		System.out.println("========================");
		System.out.println("=========웰컴웰컴랜드========");
		System.out.println("========================");
		System.out.println("===원하시는 직업을 입력해주세요===");
		System.out.println("==백수(1),건물주(2),탈주(q)==");
		Scanner scan = new Scanner(System.in);
		String cmd = "";
		for(;;) { // while문으로 해도 상관X
			System.out.println("입력 :");
			cmd = scan.nextLine();
			
			if("q".equals(cmd)) {
				System.out.println("하..탈주했군...답이없다..");
				break;
			}
			
			if("1".equals(cmd)) {
				System.out.println("백수?? 진짜로?? 다시 선택할 기회를 드릴게요..");
			}else if("2".equals(cmd)) {
				System.out.println("건물주로 생활합니다");
				System.out.println("사실 그런 생활은 없었습니다..");
			}else if("3".equals(cmd)) {
				System.out.println("아니 싯팔 저 개발자가 꼴받게하잖아");
				System.out.println("다시 고를래요..");
			}else {
				System.out.println("제발 직업을 골라주세요..");
			}
		}
			
		
				
	}
}


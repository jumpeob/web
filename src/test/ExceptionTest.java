package test;

public class ExceptionTest {

	static void printSomething(String str) throws Exception{
		if("".equals(str)) {
			throw new Exception("야 빈문자열을 왜 프린트해?");
		}
		System.out.println(str);
	}
	public static void main(String[] args) {
		try {
			printSomething("");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String str = "백이십";
		int num = Integer.parseInt(str);
		System.out.println(num);
		System.out.println("위코드가 정상이면 난실행됨");
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("위코드 드라이버가있다면 난실행됨");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

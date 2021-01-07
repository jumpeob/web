package test2;

class Game{
	public Game() {
		super();
		System.out.println("1");
	}
	public Game(int money) {
		super();
		System.out.println("2");
	}
}
class LOL extends Game{
	public LOL() {
		super(0);
		System.out.println("3");
	}
	public LOL(int i) {
		super();
		System.out.println("4");
	}
}
public class InheritTest {

	public static void main(String[] args) {
		LOL l = new LOL(3);
		
	}
}

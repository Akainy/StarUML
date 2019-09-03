package kr.ac.daelim.uml.strategy;

public class Zoo {
	public static void main(String[] args) {
		// Tiger, Eagle, Animal 전부 생성 가능
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		Animal turtle = new Turtle();
		
		tiger.performCry();
		tiger.performFly();
		tiger.move();
		tiger.display();
		System.out.println("--------------------");
		eagle.performCry();
		eagle.performFly();
		eagle.move();
		eagle.display();
		System.out.println("--------------------");
		turtle.performCry();
		turtle.performFly();
		turtle.move();
		turtle.display();

	}

}

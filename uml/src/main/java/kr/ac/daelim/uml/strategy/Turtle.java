package kr.ac.daelim.uml.strategy;

public class Turtle extends Animal {
	IFly fly;
	ICry cry;
	public Turtle()
	{
		// 값을 넣어주지 않으면 오류발생
		// Exception in thread "main" java.lang.NullPointerException
		fly = new FlyNoway();
		cry = new CryNoWay();
	}
	
	public void display()
	{
		System.out.println("거북이 모습");
	}
	
	public void move()
	{
		System.out.println("거북이 이동");
	}
	
	public void performFly()
	{
		fly.Fly();
	}
	
	public void performCry()
	{
		cry.Cry();
	}
}

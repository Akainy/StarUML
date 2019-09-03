package kr.ac.daelim.uml.strategy;

public class Eagle extends Animal {
	IFly fly;
	ICry cry;
	public Eagle()
	{
		// 값을 넣어주지 않으면 오류발생
		// Exception in thread "main" java.lang.NullPointerException
		fly = new FlyWithWings();
		cry = new BirdCry();
	}
	
	public void display()
	{
		System.out.println("독수리 모습");
	}
	
	public void move()
	{
		System.out.println("독수리 이동");
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

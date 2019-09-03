package kr.ac.daelim.uml.strategy;

public class Tiger extends Animal {
	IFly fly;
	ICry cry;
	public Tiger()
	{
		// 값을 넣어주지 않으면 오류발생
		// Exception in thread "main" java.lang.NullPointerException
		fly = new FlyNoway();
		cry = new TigerCry();
	}
	
	public void display()
	{
		System.out.println("호랑이 모습");
	}
	
	public void move()
	{
		System.out.println("호랑이 이동");
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

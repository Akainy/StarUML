package kr.ac.daelim.uml;

public class Unit {
	public String name;
	public int health;
	
	public void Move()
	{
		System.out.println("유닛이 움직인다.");
	}
	public void UnderAttack(Character character)
	{
		System.out.println("유닛이 공격을 받는다.");
	}
}

package kr.ac.daelim.uml;

public class Medic extends Unit{
	public void Move()
	{
		System.out.println("메딕이 움직인다.");
	}
	public void Healing(Character character)
	{
		System.out.println("메딕이 치료한다.");
	}
	public void UnderAttack(Character character)
	{
		System.out.println("메딕이 공격을 받는다.");
	}
}

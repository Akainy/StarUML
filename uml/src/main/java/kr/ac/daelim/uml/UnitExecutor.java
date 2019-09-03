package kr.ac.daelim.uml;

public class UnitExecutor {

	public static void main(String[] args) {
		Unit unit = new Unit();
		unit.Move();
		
		Marine marine = new Marine();
		marine.Move();
		marine.Attack();
		
		Medic medic = new Medic();
		medic.Move();
		medic.Healing(null);

	}

}
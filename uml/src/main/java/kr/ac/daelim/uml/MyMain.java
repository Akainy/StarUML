package kr.ac.daelim.uml;

public class MyMain {

	public static void main(String[] args) {
		//SampleClass s = new SampleClass();
		// new 를 사용하면 리소스가 지속적으로 세고있다는 뜻
		SampleClass s = SampleClass.getInstance();
		s.samplePrint();
		//
		// 복잡한 로직
		//
		s = SampleClass.getInstance();
		s.samplePrint();
	}

}

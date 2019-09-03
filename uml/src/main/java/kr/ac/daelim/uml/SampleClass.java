package kr.ac.daelim.uml;

public class SampleClass {
	private static SampleClass sampleClass;
	
	public static SampleClass getInstance()
	{
		if(sampleClass == null)
		// 샘플클래스에 있는 어떤것을 객체화 시키기 위함
			sampleClass = new SampleClass();
		return new SampleClass();
	}
	
	public void samplePrint()
	{
		System.out.println("Hello Sample!");
	}
}

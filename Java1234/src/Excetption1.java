
public class Excetption1 {
	
	public static void main(String[] args) {
		System.out.println("program start");
		Excetption1 d=new Excetption1();
		d.test();
		System.out.println("program ends");
	}
	 void test()
	{
		System.out.println("running test1");
		test2();
		System.out.println("existing test1");
		
	}
	static void test2()
	{
		System.out.println("running test2");
		try {
			
		
		test3();
	
		}
	catch(Exception exe)
	{
		System.out.println("Exception is handled");
		
	}
		System.out.println("existing test2");
		}
	static void test3()
	{
	System.out.println("running test3");
	
	
		int i=100;

		int j=i/0;
	
	
	System.out.println("existing test3");
}
	
}

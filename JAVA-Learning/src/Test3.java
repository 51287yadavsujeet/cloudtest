
public class Test3 {
	public static void main(String[] args) {


		Test3 ts3=new Test3();
		//ts3=null;
		
		ts3.meth1(ts3);
	}

	void meth1(int a)
	{
		System.out.println("i am in INT");
	
	}


	void meth1(String a)
	{
		System.out.println("i am in String");
	
	}
	void meth1(Object a)
	{
		System.out.println("i am in Object");
	
	}
}

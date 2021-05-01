
public class Child extends Paarent {
	
	public static void main(String[] args) {
		
		
		Paarent p1=new Paarent();
		Paarent p2=new Child();
		p1.meth();
	    p2.meth();
		
	    
	}

	
	public void meth() {
		System.out.println("i am in SUPER class");
		super.meth();
		
		
	}


	public void meth() {
		System.out.println("i am in SUPER class");
		
		
		
	}
}

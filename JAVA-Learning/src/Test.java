import java.util.Optional;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("i love my india");
		/*
		 * Parent pr= null; pr.meth1(); pr.meth2();
		 */

		String str = new String("");  
		str=null;
		Optional<String> checkNull = Optional.ofNullable(str);  
		if(checkNull.isPresent()){  // check for value is present or not  
			String lowercaseString = str.toLowerCase();  
			System.out.print(lowercaseString);  
		}else  
			System.out.println("string value is not present");  
	}  
}



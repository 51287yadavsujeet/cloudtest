
public class TryTest {

	public static void main(String[] args) {


		try {
			int i=1;
			int j=0;
			int k=0;
			if ((i/j)>=k) {
			System.out.println(" i am try");
		
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(" i am catch and executed exit");
			//System.exit(8);
		

		}
		finally {
			System.out.println(" i am finallly");


		}

	}
}

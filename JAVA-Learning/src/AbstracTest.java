
public class AbstracTest extends TestAbstract {
public static void main(String[] args) {
	
	
//TestAbstract ts=new AbstracTest();
	AbstracTest ts=new TestAbstract();

ts.meth1();
ts.meth2();
	

}

@Override
void meth2() {
	System.out.println("i am in Method2");
	
}}


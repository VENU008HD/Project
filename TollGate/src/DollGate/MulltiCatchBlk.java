package DollGate;

public class MulltiCatchBlk {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
try {
	int a[]=new int[5];
	a[4]=30/1;
}
catch (ArrayIndexOutOfBoundsException e) {
	System.out.println("Array INdex out of bound exception");
	System.out.println("Excetion ocured");
	
}
catch (ArithmeticException e)
{
	System.out.println("Arithmetic Exception Occur");
	System.out.println("can't divided by zero");
}
	}

}
 
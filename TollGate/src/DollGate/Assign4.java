package DollGate;

public class Assign4 {

	public void meth1(int a, int b)
	{
		int Sum= a+b;
		System.out.println("addition of mt1 is =" +Sum);
	}
	
	public void meth1(int a, int b, int c)
	{
		int Sum= a+b+c;
		System.out.println("addition of mt1 is =" +Sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Assign4 LoL=new Assign4();
         LoL.meth1( 13 , 13 );
         LoL.meth1( 14 , 15 , 16 );
	}

}

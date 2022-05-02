package DollGate;

public class ClassA {


void display(int n)
{
	for(int i=0; i<n; i++)
	{
		for(int j=0; j<=i ; j++)
		{
			System.out.println("* ");
		}
	System.out.println();
	}
}
public static void main(String[] args) {
	ClassA obj = new ClassA();
	obj.display(5);
}
	
}


package DollGate;

public class Assignment1 {
	String name;
	int    rollno;
	String Group;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1 std1=new Assignment1();
		std1.init(001,"Venu","E.C.E");
		std1.display();
	}
	void init(int rollno_temp, String name_temp, String group_temp) {
		rollno=rollno_temp;
		name=name_temp;
		Group=group_temp;
	}
	void display()
	{
		System.out.println("Name = " +name);
		System.out.println("rollno = " +rollno);
		System.out.println("Group = " +Group);
	}

}

package DollGate;

public class GlassName {

 String empname;
int Salary;
	String company;
	String job;


void init( String empname_temp,int Salary_temp,String company_temp,String job_temp) {
	empname= empname_temp;
	Salary= Salary_temp;
	company= company_temp;
job= job_temp;	
}

void display() {
	System.out.println("empname="	 +empname);
System.out.println("Salary=" +Salary);
System.out.println("compay=" +company);
System.out.println("job=" +job);
	
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GlassName LLL=new GlassName();
			LLL.init("lol",1500,"company3","company1"    );
			LLL.display();




		
	}

}


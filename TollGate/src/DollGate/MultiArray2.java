package DollGate;

public class MultiArray2 {
int id;
int rollname;
String Name;
  public  MultiArray2(int idnumber,int RollNumber,String Name1) {
	  id=idnumber;
	  rollname=RollNumber;
	  Name=Name1;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultiArray2 myobj=new MultiArray2(121,456,"fdgd");
System.out.println(myobj.id + myobj.rollname +  myobj.Name);
}

}

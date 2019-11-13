
public class A {
	
	String Empname;
	int Empid;
	int contact;
	
	A(String Empname,int Empid,int contact){
		this.Empname=Empname;
		this.Empid=Empid;
		this.contact=contact;
		System.out.println();
	}

	public static void main(String[] args) {
		A a1=new A("Salman",23113,21313);
		System.out.println("EmpName:"+a1.Empname+"\n"+"Empid:"+a1.Empid+"\n"+"Contact:"+a1.contact);
		
	}

}

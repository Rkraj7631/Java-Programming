import java.util.Scanner;
class Company{
	String Company_name="Silver";
	String Address="Rajkot";
	
	void display(){
	System.out.println("Company Name : "+Company_name);
	System.out.println("Company Address : " + Address);
	}
}
class Employee extends Company{
	Scanner sc=new Scanner(System.in);

	Employee(){
	String Emp_name;
	System.out.println("Enter Your Name : ");
	Emp_name=sc.nextLine();
	System.out.println("Your Name : "+Emp_name);
	}
}

class Single_Inheritance{
	public static void main(String[]args){
	Employee e1=new Employee();
	e1.display();
	}

}
import java.util.Scanner;
class Company{
	String company_name;
	String address;
	Scanner sc=new Scanner(System.in);

	Company(){
	System.out.println("Enter Your Company Name : ");
	company_name=sc.nextLine();

	System.out.println("Enter Your Company Address : ");
	address=sc.nextLine();
	}
}


class Dept extends Company{	
	String dept;
	Dept(){
	System.out.println("welcome to Dept Class ");
	System.out.println("Enter your Department Name : ");
	dept=sc.nextLine();
	}
}

class Employee extends Dept{
	String emp_name;
	int salary;
	
	Employee(){
	System.out.println("Welcome to Employee Class ");
	System.out.println("Enter Your Name : ");
	emp_name=sc.nextLine();

	System.out.println("Enter Your Salary : ");
	salary=sc.nextInt();
	}

	void display(){
		System.out.println("------------Employee Details----------------");
		System.out.println("Company Name     : " +company_name);
		System.out.println("Company Address  : " + address);
		System.out.println("Department       : " +dept);
		System.out.println("Employee Name    : "+emp_name);
		System.out.println("Salary 	     : "+ salary );
		}

	

}


class Multilevel_inheritance{
	public static void main(String[]args){
	System.out.println("Welcome to Multilevel Inheritance");

	Employee e1=new Employee();
	e1.display();

	}


}
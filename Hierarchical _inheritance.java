import java.util.Scanner;
class Company{
	String company_name;
	String address;
	Scanner sc=new Scanner(System.in);
	
	Company(){
	System.out.println("Enter Your company Name : ");
	company_name=sc.nextLine();

	System.out.println("Enter Your Company Address : ");
	address =sc.nextLine();
	}

}

class Manager extends Company{
	String emp_name;
	String dept ;
	double salary ;
	char level ;

	Manager(){
	System.out.println("Enter Your Name : ");
	emp_name=sc.nextLine();

	System.out.println("Enter Your Department : ");
	dept=sc.nextLine();

	System.out.println("Enter Your Salary : ");
	salary=sc.nextDouble();

	System.out.println("Enter your level : ");
	level=sc.next().charAt(0);
	
	}

	void display(){
	System.out.println("-----------Manager Details----------");
	System.out.println("Company Name 	: " +company_name);
	System.out.println("Company Address	: "+address);
	System.out.println("Manager Name	: "+emp_name);
	System.out.println("Department		: "+dept);
	System.out.println("Salary		: "+salary);
	System.out.println("Level		: "+level);
	}
	
}


class Employee extends Company{
	String emp_name;
	String dept ;
	double salary ;
	char level ;

	Employee(){
	System.out.println("Enter Your Name : ");
	emp_name=sc.nextLine();

	System.out.println("Enter Your Department : ");
	dept=sc.nextLine();

	System.out.println("Enter Your Salary : ");
	salary=sc.nextDouble();

	System.out.println("Enter your level : ");
	level=sc.next().charAt(0);
	
	}

	void display(){
	System.out.println("-----------Employee Details----------");
	System.out.println("Company Name 	: " +company_name);
	System.out.println("Company Address	: "+address);
	System.out.println("Employee Name	: "+emp_name);
	System.out.println("Department		: "+dept);
	System.out.println("Salary		: "+salary);
	System.out.println("Level		: "+level);
	}
	
}


class Hierarchical_inheritance{
	public static void main(String[]args){
	
	Manager m=new Manager();
	m.display();

	Employee e=new Employee();
	e.display();
	
	}
	
}
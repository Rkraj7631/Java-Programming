import java.util.Scanner;

interface Company{
	String comp="Silver Consumer Electricals Ltd.";
	void show();
}

interface Dept{
	String dept="Machine Shop";
	void display();
}

class  Employee implements Company,Dept{
	String emp_name;
	Scanner sc=new Scanner(System.in);

	Employee(){
	System.out.print("Enter Your Name :");
	emp_name=sc.nextLine();
	}

	public void show(){
	System.out.println("Company Name : "+comp);
	}

	public void display(){
	System.out.println("Department : "+dept);
	System.out.println("Employee Name : "+emp_name);
	}
	
	
}



class Interface{
public static void main(String[]args){

	Employee e1=new Employee();
	e1.show();
	e1.display();
	}
}
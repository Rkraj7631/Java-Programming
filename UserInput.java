import java.util.Scanner;
class Demo{
	Scanner sc=new Scanner(System.in);
	String dept ;
	String full_name;
	int age;
	double salary;
	float pi;
	long mob_no;
	boolean pf;
	char grade;
	
	Demo(){
	
	System.out.println("Enter your Department : ");
	dept=sc.next();
	sc.nextLine();
	
	System.out.println("Enter your Full Name : ");
	full_name=sc.nextLine();

	System.out.println("Enter Age : ");
	age=sc.nextInt();
	
	System.out.println("Enter your Salary : ");
	salary=sc.nextDouble();
	
	System.out.println("Value of pi : ");
	pi=sc.nextFloat();

	System.out.println("Enter your Mob No. : ");
	mob_no=sc.nextLong();

	System.out.println("pf deduct your salary (true/false) : ");
	pf=sc.nextBoolean();

	System.out.println("Your Grade Level is : ");
	grade=sc.next().charAt(0);

	}

	void display(){
	System.out.println("------- Employee Details---------");
	System.out.println("Department : "+dept);
	System.out.println("Full Name : " +full_name);
	System.out.println("Age : " +age);
	System.out.println("Salary : " +salary);
	System.out.println("PI : " +pi);
	System.out.println("Mob No. : " +mob_no);
	System.out.println("PF : "+ pf);
	System.out.println("Grade Level : " +grade);
	}

}



class UserInput{
	public static void main(String[]args){
	System.out.println("Welcome to User Input");
	
	Demo d1=new Demo();
	d1.display();
		
	}


}
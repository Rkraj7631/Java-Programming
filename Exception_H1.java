import java.util.Scanner;

class Exception_H1{
	public static void main(String[]args){

	Scanner sc=new Scanner(System.in);

	int x;
	int y;
	String name;
	
	try{
	System.out.print("Value of x : ");
	x=sc.nextInt();

	System.out.print("Value of y : ");
	y=sc.nextInt();

	System.out.print("Enter your Name :");

	if(sc.hasNextInt()){
		throw new Exception("Name Can Not be an Intiger");
		}
	sc.nextLine();
	name=sc.nextLine();

	System.out.println("Result "+x/y);
	System.out.println("Name : "+name);
	}

	catch(ArithmeticException e){
		System.out.println(e);
	}
	
	catch(Exception e){
	
	System.out.println("Error ! "+e.getMessage());
	
	}

	


	}
}




























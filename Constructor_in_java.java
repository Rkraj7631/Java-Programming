/*
class Construct{
	Construct(){
	System.out.println("Constructor is Called");
	}

}


class Constructor_in_java{
	public static void main(String[]args){
	Construct c1=new Construct();
	}

}

*/

/*

class Construct{
	int x;
	int y;

Construct(int p, int q){
	x=p;
	y=q;
	System.out.println("Add ="+(x+y));
	}
Construct(int p){
	x=p;
	System.out.println("Square ="+((x*x)));
	}
Construct(){
	System.out.println("Welcome To Constructor");
	}

}

class Constuctor_in_java{
	public static void main(String[]args){
	System.out.println("Main Function Called");
	
	Construct c1=new Construct(10,20);
	Construct c2=new Construct(5);
	Construct c3=new Construct(50,20);
	Construct c4=new Construct();
		
	}

}


*/

class Demo{
	String name ;
	int age;
	double salary;
	String dept;
	boolean pf;

	Demo(String n, int a, double s, String d, boolean p){
	name=n;
	age=a;
	salary=s;
	dept=d;
	pf=p;
	}

	void display(){
	System.out.println("Name : "+ name);
	System.out.println("Age : "+ age);
	System.out.println("Salary : " + salary);
	System.out.println("Dept : "+ dept);
	System.out.println("PF : " + pf);
	}
	
}


class Constructor_in_java{
	public static void main(String[]args){
	Demo d1=new Demo("Suraj Kumar",25, 25000,"IT",true);
	Demo d2=new Demo("Raj Kumar",21, 50000,"HR",false);

	d1.display();
	d2.display();
	}

}



















































package Package2;
import Package1.*;

class Package2{
	public static void main(String[]args){

	Package1 p1=new Package1();
	p1.setdata(5,3);
	p1.add();
	p1.square();
	p1.display();

	}
}

//javac -d . Package2.java "for compile the code and create folder Package2"
//java Package2.Package2 "for Run the code"
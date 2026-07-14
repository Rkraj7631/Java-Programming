import java.util.Scanner;

class Day{

	int day;

	Day(){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Number 1 to 7 : ");
	this.day=sc.nextInt();

}

	void result(){

	switch (day){
	case 1:
		System.out.println("Sunday");
		break;
	case 2:
		System.out.println("Monday");
		break;

	case 3:
		System.out.println("Tuesday");
		break;

	case 4:
		System.out.println("Wednesday");
		break;

	case 5:
		System.out.println("Thursday");
		break;

	case 6:
		System.out.println("Friday");
		break;

	case 7:
		System.out.println("Saturday");
		break;

	default:
		System.out.println("Invalid Input");
	}
	}
}



public class Switch_case{

public static void main(String[]args){

	Day d1=new Day();
	d1.result();

}
	}

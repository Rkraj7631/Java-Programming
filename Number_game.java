import java.util.Scanner;
import java.util.Random;

class Number{
	Scanner sc=new Scanner(System.in);
	Random rd=new Random();
	int num;
	int comp=rd.nextInt(100)+1;
	int count=0;
	
	void guess(){
		while(true){
		
		System.out.print("Enter Guess Number : ");
		num=sc.nextInt();
		count++;
			if(num==comp){
			System.out.println("Random No. and Enter Number is Match");
			System.out.println("Total Attempts : "+count);
			break;
			}
	
			else if(comp>num){
			System.out.println("Random number is greater");
			}

			else if(comp<num){
			System.out.println("Random number if smaller");
			}

			else{
			System.out.println("Wrong Guess Try Again");
			}
	}
}
}


public class Number_game{
	public static void main(String[]args){

	Number n1=new Number();
	n1.guess();

	}
}
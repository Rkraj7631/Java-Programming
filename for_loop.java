import java.util.Scanner;

class Table{
	Scanner sc=new Scanner(System.in);
	int table;
	int i;
	Table(){
	System.out.print("Enter a Number :");
	table=sc.nextInt();
	
	for(i=0;i<=10;i++){
	System.out.println(table+" x "+i+" = "+ (table*i));
	}
	}
}

class for_loop{
	public static void main(String[]args){

	Table t1=new Table();
	}
}
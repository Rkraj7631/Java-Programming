import java.util.Scanner;
class Marks{
	Scanner sc=new Scanner(System.in);
	int math;
	int phy;
	int che;
	int eng;
	int hindi;
	int total=500;
	int obtain;
	float percent;

	void set_marks(){
	System.out.println("Enter Math Marks : ");
	math=sc.nextInt();

	System.out.println("Enter Physics Marks : ");
	phy=sc.nextInt();
	
	System.out.println("Ener Chemistry Marks : ");
	che=sc.nextInt();

	System.out.println("Enter English Marks : ");
	eng=sc.nextInt();

	System.out.println("Enter Hindi Marks : ");
	hindi=sc.nextInt();

	obtain=(math+phy+che+eng+hindi);
	percent=((float)obtain/total)*100;
	

	}

	void profile(){
	System.out.println("Total Marks ="+obtain);
	System.out.println("Percentage ="+percent);
	}

	void pass(){
	if(percent>=30){
	System.out.println("Pass");
	}
	else{
	System.out.println("Fail");
	}
	}

	void grade() {
   	if (percent >= 90) {
        System.out.println("Grade = A+");
    	}
    	if (percent >= 80 && percent < 90) {
        System.out.println("Grade = A");
    	}
   	if (percent >= 70 && percent < 80) {
        System.out.println("Grade = B");
    	}
    	if (percent >= 60 && percent <70) {
        System.out.println("Grade = C");
    	}
    	if (percent >= 50 && percent <60) {
        System.out.println("Grade = D");
    	}
    	if (percent >=30 && percent <50) {
        System.out.println("Grade = E");
    	}
    	if(percent <30) {
        System.out.println("Grade = F");
    	}
	}
	

}



class If_else{
	public static void main(String[]args){

	Marks m1=new Marks();
	m1.set_marks();
	m1.profile();
	m1.pass();
	m1.grade();

	}
}	
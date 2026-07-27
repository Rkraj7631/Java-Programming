class One_array{
    
    void set_marks(){
        int[] arr={10,20,30,40,50,60,70};
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

class Array_java {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        One_array a1=new One_array();
        a1.set_marks();
    }
}



//Month print
import java.util.*;
class Month{
    Scanner sc=new Scanner(System.in);
    
    Month(){
        System.out.print("Enter a Number : ");
        int i =sc.nextInt();
        try{
        //if (i<=0 && i>12){
           // System.out.println("Enter a valid numbr ");
        //}
        String[] x={"january","Feburary","March","April","May","June","July","August","September","October","November","December"};
       /* for (int j=0;j<=i;j++){
            int y=i-1;
            System.out.println(x[y]);
        }
        */
        //int y=i-1;
        System.out.println(x[i-1]);
        }
        catch(Exception e){
            System.out.println("Enter a valid number");
        }
    }
}

class Array_java {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        Month m1=new Month();
    }
}
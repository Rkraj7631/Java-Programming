/*
class Basic{
    int i;
    Basic(){
        do{
            System.out.println(i);
            i++;
        }
        while(i<=5);
    }
}

class Do_While {
    public static void main(String[] args) {
        System.out.println("Welcome to do_while Loop.");
        Basic b1=new Basic();
        
    }
}

*/


/*
import java.util.*;
class Basic{
    Scanner sc=new Scanner(System.in);
    int i=1;
    int n;
    Basic(){
        System.out.print("Enter a Number : ");
        n=sc.nextInt();
        do{
            if(i%2==0){
                System.out.println(i+" is Even Number");
            }
            else{
                System.out.println(i+" is Odd Number.");
            }
            
            i++;
        }
        while(i<=n);
    }
}

class Do_While {
    public static void main(String[] args) {
        System.out.println("Welcome to do_while Loop.");
        Basic b1=new Basic();
        
    }
}

*/

import java.util.*;
class Base{
    Scanner sc=new Scanner(System.in);
    int n;
    int i=1;
    int choice;
    int total=0;
    boolean isprime=true;
    Base(){
        System.out.print("Enter a number ; ");
        n=sc.nextInt();
        
        
        
        do{
            System.out.println("1. Add Number");
            System.out.println("2. Square of Number");
            System.out.println("3. Number is Even/Odd");
            System.out.println("4. Number is Prime or Not");
            System.out.println("5. Exit");
            
            System.out.print("Enter your coice: ");
            choice=sc.nextInt();
            
            switch(choice){
                case 1:
                    for(int i=1;i<=n;i++){
                        total+=i;
                    }
                    System.out.println("Add  : "+total);
                    break;
                    
                case 2:
                    System.out.println("square : "+n*n);
                    break;
                    
                case 3:
                    if(n%2==0){
                        System.out.println("No is Even");
                    }
                    else{
                        System.out.println("No. is Odd");
                    }
                    break;
                case 4:
                    isprime=true;
                    if(n<=1){
                        isprime=false;
                    }
                    else{
                        int j=2;
                        do{
                            if(n%j==0){
                                isprime=false;
                                break;
                            }
                            j++;
                        }while(j<=(n/2));
                    }
                    if(isprime){
                        System.out.println("Number is prime");
                    }
                    else{
                        System.out.println("Number is not prime");
                    }
                    break;
                case 5:
                    System.out.println("Exit....");
                    break;
                default:
                    System.out.println("Invalid Choice ");
                    break;
            }
            i++;
        }
        while(choice !=5);
    }
}

class Do_While {
    public static void main(String[] args) {
        System.out.println("Do while using switch case ");
        
        Base b1=new Base();
    }
}
















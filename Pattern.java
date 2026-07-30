/*
// Rectangle
import java.util.*;
class Demo{
    Demo(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int y=sc.nextInt();
        for(int i=1;i<=y;i++){
            for(int j=1;j<=y;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Pattern {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        Demo d1=new Demo();
    }
}

*/

//Hallow Rectangle 

import java.util.*;
class Demo{
    Demo(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int y=sc.nextInt();
        for(int i=1;i<=y;i++){
            for(int j=1;j<=y;j++){
                if(i==1 || j==1|| i==y ||j==y ){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

class Pattern {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        Demo d1=new Demo();
    }
}
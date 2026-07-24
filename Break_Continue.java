/*
import java.util.*;
class Break_1{
    int i;
    int j;
    Scanner sc=new Scanner(System.in);
   
    Break_1(){
        System.out.print("Ener a number : ");
        i=sc.nextInt();
        for(j=0;j<=i;j++){
         if(j==5){
    
             break; //break the loop
            }
            System.out.println(j);
        }
    } 
}

class Break_Continue {
    public static void main(String[] args) {
        System.out.println("Welcom to Break and continue");
        Break_1 b1=new Break_1();
    }
}

*/

//Continue Statement

import java.util.*;
class Continue_1{
    int i;
    int j;
    Scanner sc=new Scanner(System.in);
   
    Continue_1(){
        System.out.print("Ener a number : ");
        i=sc.nextInt();
        for(j=0;j<=i;j++){
         if(j==5){
             System.out.println("Continue");
             continue;//continue the loop
            }
            System.out.println(j);
        }
    } 
}

class Main {
    public static void main(String[] args) {
        System.out.println("Welcom to Break and continue");
        Continue_1 b1=new Continue_1();
    }
}
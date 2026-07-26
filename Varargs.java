/*

import java.util.*;
class Demo{
    Scanner sc=new Scanner();
        Demo(){
            
        }
        
       void sum(int...numbers){
        int total=0;
        for (int num : numbers){
            total+=num;
        }
        System.out.println(total);
        }
}

class Varargs {
    public static void main(String[] args) {
        System.out.println("Welcome to Vargs Example.");
        System.out.print("Enter a number")
        sc.nextInt();
        Demo d1=new Demo();
        d1.sum(10,20);
        d1.sum(1,20,30,40,50,60,70);
    }
}

*/


/*
class Demo{
    static int sum(int...numbers){
        int total=0;
        for(int num:numbers){
            total+=num;
        }
        return total;
    }
}

class Varargs {
    public static void main(String[] args) {
        System.out.println("Welcome to Vargs Example.");
        System.out.println(Demo.sum(10,20));
        System.out.println(Demo.sum(1,20,30,40,50,60,70));
    }
}

*/

/*

import java.util.*;
class Demo{
    Demo(){
        System.out.println("Welcome To Varargs in Java");
    }
    void sum(int...numbers){
        int total=0;
        for(int num:numbers ){
            total+=num;
        }
        System.out.println(total);
    }
}

class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("How many numbers are enter");
       int n=sc.nextInt();
       int[] arr= new int[n];
       System.out.println("Enter "+n+" Numbers:");
       
       for (int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       Demo d1=new Demo();
       d1.sum(arr);
    }
}

*/









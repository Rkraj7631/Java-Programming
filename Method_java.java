//Crating Method

class Demo{
    static void method_java(){
        System.out.println("Welcome to Creating Method in java");
    }
}

class Method_java {
    public static void main(String[] args) {
        System.out.println("Method In java");
        Demo.method_java();
    }
}

//method with parameters

class Demo{
    static void method_java(int age,String name){
        System.out.println(age);
        System.out.println(name);
    }
}

class Method_java {
    public static void main(String[] args) {
        System.out.println("Method with Parameters In java");
        Demo.method_java(25,"Suraj");
    }
}


// Method with return value


import java.util.Scanner;
class Demo{
    static Scanner sc=new Scanner(System.in);
    static int method_java(int n){
        System.out.print("Enter a Number :");
        n=sc.nextInt();
        return n*n;
    }
}

class Method_java {
    public static void main(String[] args) {
        System.out.println("Method With Return In java");
        int result=Demo.method_java(25);
        System.out.println("Square of n : "+result);
    }
}



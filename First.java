class A{
static int x;
static int y;
static void fun1(){
x=25;
y=32;
}

static void fun2(){
System.out.println(y-x);

}
}


class First{
public static void main(String[]args){
System.out.println("First Program in java");

A.fun1();
A.fun2();

}
}
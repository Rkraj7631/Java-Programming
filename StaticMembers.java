class A{
private int x;
private static int y;

void fun1(){
x=221;
y=3;
}

void fun2(){
System.out.println(x*y);
}

}
class StaticMembers{
public static void main(String[]args){

System.out.println("Static Members");

A a1=new A();
A a2=new A();

a2.fun1();
a2.fun2();

}

}
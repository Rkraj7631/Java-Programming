class A{
String x="1456";
String y="10101";

}


class Wrap{
public static void main(String[]args){
	int x=Integer.parseInt("123");
	Integer x1 =Integer.valueOf("10110",2);
	int y=x1.intValue();
	System.out.println(x);
	System.out.println(y);
	
	A a1=new A();
	double z=Integer.parseInt(a1.y,2);
	double w=Double.parseDouble(a1.x);
	
	System.out.println(z);
	System.out.println(w);

	}

}

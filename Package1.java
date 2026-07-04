package Package1;

public class Package1{
private int x;
private int y;
private int add;
private double s;

public void setdata(int p, int q){
	x=p;
	y=q;
	}

public void add(){
	add=x+y;
	}

public void square(){
	s=Math.pow(x,y);
	}
public void display(){
	System.out.println("Sum of" + x + "and"+ y + "=" + add);
	System.out.println(x+"raised to "+ y +"="+ s);
	}

}


//javac -d . Package1.java  "For Create a Package and compile the file"
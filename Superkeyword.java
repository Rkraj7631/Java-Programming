class Demo{
	int x;
	int y;

	Demo(int p, int q){
	x=p;
	y=q;
	}
	
}

class Setdata extends Demo{
	
	
	Setdata(int a, int b){
		super(a,b);
		}

	void display(){
	System.out.println("x ="+super.x);
	System.out.println("y =" + super.y);
	System.out.println("Add of X+y ="+(super.x+super.y));
	}
	}

class Superkeyword{
	public static void main (String[]args){

	Setdata s1=new Setdata(20,30);
	s1.display();
	
	}


}
abstract class Demo{
	int x=5;

	Demo(){
	System.out.println(x);
		}
	abstract void show();		//abstract function have no body 

}

class Demo1 extends Demo{
	void show(){
		System.out.println("Override Abstract Method in Abstract Class");
	}	

}




class Abstract_class{
	public static void main(String[]args){
		
		Demo1 d1=new Demo1();
		d1.show();
	
		}
	
}
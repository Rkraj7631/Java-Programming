class Process1 implements Runnable{
	public void run(){
	int x;
	for (x=1;x<=10;x++){
		System.out.println("Process1 "+x);
		}
	}
}

class Process2 implements Runnable{
	public void run(){
	int x;
	for (x=1;x<=10;x++){
		System.out.println("Process2 "+x);
		}
	}
}



class Thread1{
	public static void main(String[]args){
	Process1 p1=new Process1();
	Process2 p2=new Process2();

	Thread t1=new Thread(p1);
	Thread t2=new Thread(p2);

	t1.start();
	t2.start();
}
}

// 2nd Method


class Process1 extends Thread{
	public void run(){
	int x;
	for (x=1;x<=10;x++){
		System.out.println("Process1 "+x);
		}
	}
}

class Process2 extends Thread{
	public void run(){
	int x;
	for (x=1;x<=10;x++){
		System.out.println("Process2 "+x);
		}
	}
}


class Thrad1{
	public static void main(String[]args){
	
	Process1 p1=new Process1();
	Process2 p2=new Process2();

	p1.start();
	p2.start();

	}
}







/*
class Commandlineargs{
public static void main(String[]args){
	int i; 
	for(i=0;i<args.length;i++)
	System.out.println(args[i]);
	}
}

//java Commandlineargs 10 20 30 50 60 40 suraj raj kumar 

*/


class Commandlineargs{
public static void main(String[]args){
	int i, s=0;
	for(i=0;i<args.length;i++){
		s+=Integer.parseInt(args[i]);
		System.out.println("Average is"+s/args.length);
		}
	}


}

//java Commandlineargs 10 20 30 50 60 40
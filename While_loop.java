class While_loop{
    public static void main(String[]args){
            int i=1;
            while(i<=10){
                System.out.println(i);
                i++;
                if(i==5){
                    try{
                        Thread.sleep(1000);
                        System.out.println("1000 ms hold");
                    }
                    catch(InterruptedException e){
                        System.out.println(e.getMessage());
                    }
                }
            }
    }
}




import java.util.*;
class While_loop{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
            int i;
            int j=1;
            try{
                System.out.print("Enter your Number : ");
                i=sc.nextInt();
                if (i<=0){
                    throw new Exception("Plese Enter a valid number");
                }
                System.out.print("Factor of "+i+" :");
                while(j<i){
                        if(i%j==0){
                            System.out.print(j+" "); 
                        }
                        j++;
                    }
                    
                }
            catch(Exception e){
                System.out.println(e.getMessage());
                }
    }
}
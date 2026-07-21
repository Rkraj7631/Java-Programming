import java.util.*;
class ExceptH2{
    Scanner sc=new Scanner(System.in);
    int x;
    int y;
    String name;
    
    
    ExceptH2(){
        try{
            System.out.print("Enter Value of x : ");
            x=sc.nextInt();
            
            System.out.print("Enter value of y : ");
            y=sc.nextInt();
            
            sc.nextLine();
            System.out.print("Enter your Name : ");
            name=sc.nextLine();
            if(name==null ||name.isEmpty() || !name.matches("[a-zA-z]+")){
            throw new IllegalArgumentException("Enter a valid value");
             }
            
            System.out.println(x/y);
            System.out.println("Name ; "+name);
            
            
        }
        catch(ArithmeticException e){
            System.out.println("Number is not divide by 0");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Welcome to Exception Handling");
        }
    }
    
}


class Exception_H2 {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        
        ExceptH2 e1=new ExceptH2();
    }
}
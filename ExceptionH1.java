import java.util.*;
class Except{
Scanner sc=new Scanner(System.in);
int x;
int y;
String name;

    Except(){
        try{
            System.out.print("Enter no. x : ");
            x=sc.nextInt();
            System.out.print("Enter no. y : ");
            y=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter your Name : ");
            name=sc.nextLine();
            if(!name.matches("[a-zA-Z]+")){
                throw new IllegalArgumentException(name +" Wrong Entry Enter a String");
            }

            System.out.println(x/y);
            System.out.println(name);
        }
        catch(ArithmeticException e){
            System.out.println("Number is not Divide by zero");
        }

        catch(InputMismatchException e){
            System.out.println("Error !  plese Enter a String");
        }

        catch(IllegalArgumentException e) {
        System.out.println(e.getMessage());
        }
         
        catch(Exception e){
            System.out.println(e);
        }
    }

}

class ExceptionH1{
    public static void main(String[]args){
        Except e1=new Except();

    }

}
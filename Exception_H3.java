import java.util.*;
class Company{
    Scanner sc=new Scanner(System.in);
    String comp_name="Silver Consumer Electricals ltd.";
    String comp_add="Rajkot Gujarat";
    String name;
    int salary;
    void employee()throws Exception {
        System.out.print("Enter your name : ");
        name=sc.nextLine();
        if(name==null ||!name.matches("[a-zA-Z]+")){
            throw new Exception("Enter a Valid Value ! ");
        }
        
        System.out.print("Enter your salary : ");
        salary=sc.nextInt();
        if(salary<=0){
            throw new Exception("Salary is not 0 or null ");
        }
    }
    void display()throws ClassNotFoundException{
        Class.forName("Employee");
        
        System.out.println("Company Name : "+comp_name);
        System.out.println("company Address : "+comp_add);
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Salary : "+salary);
    }
}

class Employee extends Company{
    void show()throws ClassNotFoundException{
        super.display();
    } 
}

class Main {
    public static void main(String[] args) {
        try{
            Employee e1=new Employee();
            e1.employee();
            e1.show();
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
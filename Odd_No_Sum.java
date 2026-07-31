import java.util.*;
class Sum_odd{
    Scanner sc=new Scanner(System.in);
    int n;
    
    Sum_odd(){
        System.out.print("Enter a Number : ");
        n=sc.nextInt();
    }
    
    void addNo(){
        int odd=0;
        int even=0;
        for(int i=1; i<=n;i++){
            if(i%2!=0){
                odd+=i;
            }
            else{
                even+=i;
            }
        }
        System.out.println("Odd Number Sum "+odd);
        System.out.println("Even Number Sum "+even);
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        Sum_odd s1=new Sum_odd();
        s1.addNo();
    }
}
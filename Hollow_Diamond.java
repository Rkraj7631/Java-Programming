import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("Dimond Pattern");
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter a Number : ");
        n=sc.nextInt();
        
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            System.out.print(" *");
            
            for(int j=2;j<=2*i-1;j++){
                System.out.print("  ");
            }
            if(i>=2){
            System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=n-1;i>=1;i--){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            System.out.print(" *");
            
            for(int j=2;j<=2*i-1;j++){
                System.out.print("  ");
            }
            if(i>=2){
            System.out.print("*");
            }
            System.out.println();
        }
}
}
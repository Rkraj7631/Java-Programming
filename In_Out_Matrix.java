import java.util.*;
class Input_Matrix{
    Scanner sc=new Scanner(System.in);
    int[][] arr;
    
    Input_Matrix(){
        System.out.print("How many rows : ");
        int row=sc.nextInt();
    
        System.out.print("How many Columns : ");
        int col=sc.nextInt();
        
        arr=new int[row][col];
        
        for(int i=0; i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print((i+1)+","+(j+1) +": ");
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void display(){
        System.out.println("Output Matrix");
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
class In_Out_Matrix {
    public static void main(String[] args) {
        Input_Matrix i1=new Input_Matrix();
        i1.display();
    }
}
import java.util.*;
class Demo{
    Scanner sc=new Scanner(System.in);
    int[][] arr;
    int x;
    int y;
    
    Demo(){
        
        System.out.print("Enter How Many rows : ");
        x=sc.nextInt();
        System.out.print("Enter How Many Columns :");
        y=sc.nextInt();
        arr=new int [x][y];
        
        for (int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print("Enter "+(i+1)+","+(j+1)+" Number:");
                arr[i][j]=sc.nextInt();
            }
        }
    }
    
    void array_toString(){
        System.out.println(Arrays.deepToString(arr));
    }
    
    void row_sum(){
        for(int i=0;i<x;i++){
            int row_sum=0;
            for(int j=0;j<y;j++){
                row_sum+=arr[i][j];
                }
                System.out.println("Sum of Row"+(i+1)+" : "+row_sum);
        }
        
    }
    
    void column_sum(){
        for(int i=0;i<y;i++){
            int col_sum=0;
            for (int j=0;j<x;j++){
                col_sum+=arr[j][i];
            }
            System.out.println("Sum of column " + (i + 1) + " : " + col_sum);
        }
    }
    
}

class Sum_row_col {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        Demo d1=new Demo();
        d1.array_toString();
        d1.row_sum();
        d1.column_sum();
        
    }
}
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
    
    void large_small(){
        int large=0;
        int small=arr[0][0];
        for (int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(arr[i][j]>large){
                    large=arr[i][j];
                }
                else if(arr[i][j]<small){
                    small=arr[i][j];
                }
            }
        }
        System.out.println("Larges Number : "+large);
        System.out.println("Smallest Number : "+small);
    }
    
}

class Find_large_samll {
    public static void main(String[] args) {
        System.out.println("Find Smallest and Largest Number");
        Demo d1=new Demo();
        d1.array_toString();
        d1.large_small();
        
        
    }
}
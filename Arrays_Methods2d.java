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
    
    void row_String(){
        System.out.print("Which Row to covert to String : ");
        int c=sc.nextInt();
        if(c>0 && c<arr.length){
            Arrays.sort(arr[c-1]);
            System.out.println(Arrays.toString(arr[c-1])); 
           
        }
        else{
            System.out.println("Invalid Index");
        }
        
    }
    
}

class Arrays_Methods2d {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        Demo d1=new Demo();
        d1.array_toString();
        d1.row_String();
    }
}
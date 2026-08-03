
import java.util.*;

class Input{
    int n;
    Scanner sc=new Scanner(System.in);
    int[] arr;
    
    Input(){
        
        System.out.print("How Many enter no. in array : ");
        n=sc.nextInt();
        arr=new int[n];
        
        for (int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" Number :");
            arr[i]=sc.nextInt();
            }
        }
    
        void display(){
            for(int x:arr)
            System.out.print(x+" ");
            System.out.println();
         }
         
        void convert_toString(){
            System.out.println(Arrays.toString(arr));
            System.out.println();
        }

        void arrays_sort(){
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
        void arrays_binarySearch(){
            System.out.print("Enter number for search in Array : ");
            int k=sc.nextInt();
            int index=Arrays.binarySearch(arr,k);
            System.out.println("index of "+k+ " is : "+index);
        }
        void copyOf_array(){
        int[] arr1=Arrays.copyOf(arr,(n+3));
        System.out.print(Arrays.toString(arr1));
            
        }
}

class Arrays_Methods1.java {
    public static void main(String[] args) {
        System.out.println("Arrays Methods in java");
        
        Input i1=new Input();
        i1.display();
        i1.convert_toString();
        i1.arrays_sort();
        i1.arrays_binarySearch();
        i1.copyOf_array();
    }
}
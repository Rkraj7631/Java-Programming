import java.util.*;

//Bubble Sort

class Sorting {
    public static void main(String[] args) {
        System.out.println("Bubble Sort");
        int[]arr={2,6,7,1,5,3};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int value=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=value;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}


//Insertion Sort

import java.util.*;

class Sorting {
    public static void main(String[] args) {
        System.out.println("Insertion Sort");
        int[] arr={5,2,4,6,3,9,7};
        
        for(int i=1; i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            
                while(j>=0 && arr[j]>key){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=key;
        }
        System.out.println(Arrays.toString(arr));
    }
}


//Selection Sort

import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2};
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}


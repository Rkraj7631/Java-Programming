import java.util.*;
class String_java{
    Scanner sc=new Scanner(System.in);
    String str;
    String str1;
    
    String_java(){
        System.out.print("Enter a First String : ");
        str = sc.nextLine();
        System.out.print("Enter a Second String : ");
        str1 = sc.nextLine();
        
    }
    void str_length(){
        System.out.print("Length of String is :"+str.length());
        System.out.println();
    }
    
    void character_find(){
        System.out.print("Enter a Number For find character : ");
        int i =sc.nextInt();
        System.out.print(str.charAt(i)+" is index of "+i);
        System.out.println();
    }
    
    void substring_find(){
        System.out.print("Start index : ");
        int i=sc.nextInt();
        
        System.out.print("End index : ");
        int j=sc.nextInt();
        
        System.out.print(str.substring(i,j)+"is the index between "+i+","+j);
        System.out.println();
    }
    
    void upper_lower(){
        System.out.println("String is Upper Case : "+str.toUpperCase());
        System.out.println("String is Lower Case : "+str.toLowerCase());
    }
    
    void string_equals(){
        System.out.println("String is Equlas : "+str.equals(str1));
    }
}

class String1 {
    public static void main(String[] args) {
        System.out.println("String In java");
        String_java s=new String_java();
        s.str_length();
        s.character_find();
        s.substring_find();
        s.upper_lower();
        s.string_equals();
    }
}
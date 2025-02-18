 import java.util.*;
 public class Main {
     public static void main (String []args){
         Scanner sc= new Scanner(System.in);
         System.out.print("enter the marks ");
         int  marks =sc.nextInt();
        if(marks>90&&marks<100){
            System.out.println("the grade is A");
        }else if(marks>60&&marks<90){
            System.out.println("the grade is B");
        }
        else{
            System.out.println("the grade is C");
        }
        }
}

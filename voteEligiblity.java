 import java.util.*;
 public class Main {
     public static void main (String []args){
         Scanner sc= new Scanner(System.in);
         System.out.print("enter the age  ");
         int age  =sc.nextInt();
        if(age>18){
            System.out.println("Eligible for voting ");
        }
        else{
            System.out.println("Not eligible ");
        }
        }
}


import java.util.*;
 public class Main {
     public static void main (String []args){
         Scanner sc= new Scanner(System.in);
         System.out.print("enter the year  ");
         int year  =sc.nextInt();
         
        if(year%4==0 ){
            System.out.println(year +" is a leap year  ");
        } else{
            System.out.println(year +" is not leap year ");
        }
     }
 }
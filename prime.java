import java.util.*;
 public class Main {
     public static void main (String []args){
         Scanner sc= new Scanner(System.in);
         System.out.print("enter the number  ");
         int number  =sc.nextInt();
         int count=0;
         for(int i=1;i<=number;i++){
             if(number % i==0){
                 count++;
             }
            
         }
        if(count ==2 ){
            System.out.println(number +" is a prime ");
        } else{
            System.out.println(number +" is not prime");
        }
        }
    
        }
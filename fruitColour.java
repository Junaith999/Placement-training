 import java.util.*;
 public class Main {
     public static void main (String []args){
         Scanner sc= new Scanner(System.in);
         System.out.print("enter the name ");
         String name=sc.nextLine();
         switch  (name){
         case "apple":
             System.out.println("apple is red");
             break;
             case "banana":
                 System.out.println("banana is yellow");
                 break;
                 case "orange":
                     System.out.println("orange is orange ");
                     break;
                     default:
                     System.out.println("invalid");
                     break;
         }
                     
     }
     
 }
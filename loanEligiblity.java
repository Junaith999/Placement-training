import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.println("Enter your Score: ");
        int score = scanner.nextInt();

        if (age < 20) {
            if (salary < 10000 && score < 700) {
                System.out.println("You are NOT ELIGIBLE");
            } else {
                if (salary > 25000 && score > 850) {
                    System.out.println("You are Eligible for 5 lakh LOAN");
                }
            }
        } else if (age > 20) {
            if (salary > 20000 && score > 800) {
                System.out.println("You are Eligible for  2 lakh LOAN");
            } else {
                System.out.println("You are NOT ELIGIBLE");
            }
        }

        scanner.close(); 
    }
}














































































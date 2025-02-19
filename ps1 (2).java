import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number ");
		int number=sc.nextInt();
		int factorial=1;
		int sum=0;
		while(number !=0) {
		    factorial=1;
			for(int i=1; i<=number%10; i++) {
				factorial*=i;
			}
			sum+=factorial;
			number=number/10;
		}
		System.out.println(sum);

	}

}


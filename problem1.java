import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter M: ");
		int M = sc.nextInt();
		System.out.print("Enter N: ");
		int N = sc.nextInt();
		sc.close();
		int sumOfSquares = 0;
		if (M > N) {
			System.out.println("M should not be greater than N. Sum is 0.");
			return;
		}
		for (int i = M; i <= N; i++) {
			if (isPrime(i)) {
				sumOfSquares += i * i;
			}
		}

		System.out.println("Sum of squares of primes between " + M + " and " + N + " is: " + sumOfSquares);
	}
	public static boolean isPrime(int number) {
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		return count == 2; 
	}
}


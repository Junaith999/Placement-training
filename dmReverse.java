public class Main
{
	public static void main(String[] args) {
		int number=123;
		int digit =0;
		while(number!=0) {
			digit=digit*10+number%10;
			number=number/10;

		}
		System.out.println(digit);
	}
}
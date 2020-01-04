package Task;
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		int n;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your number: ");
		n=obj.nextInt();
		if(n%15==0) {
			System.out.println("Fizz-Buzz");
		}else if(n%3==0) {
			System.out.println("Fizz");
		}else if(n%5==0) {
			System.out.println("Buzz");
		}else {
			System.out.println("number is not proceed");
		}

	}

}

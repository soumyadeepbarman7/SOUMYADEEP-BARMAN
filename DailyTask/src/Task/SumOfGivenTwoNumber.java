package Task;
import java.util.Scanner;

public class SumOfGivenTwoNumber {

	public static void main(String[] args) {
		int min,max;
		int sum=0;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Starting from: ");
		min=obj.nextInt();
		Scanner obj1=new Scanner(System.in);
		System.out.println("closing number: ");
		max=obj1.nextInt();
		for(int i=min;i<=max;i++) {
			sum=sum+i;
		}
		System.out.println("sum is : "+sum);

	}

}

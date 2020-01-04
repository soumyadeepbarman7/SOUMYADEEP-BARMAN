package Task;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
        int num , reversed = 0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Print the number u want to reverse: ");
        num=obj.nextInt();
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);

	}

}

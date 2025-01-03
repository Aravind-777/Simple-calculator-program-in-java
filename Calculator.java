
import java.util.Scanner;
public class Calculator{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Simple Calculator");
		System.out.println();
		System.out.println("Choose your operator");
		System.out.println();
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println();
		int operation=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch(operation) {
		case 1:
			System.out.println("1.Addition :"+(a+b));
			break;
		case 2:
			System.out.println("2.Subtraction :"+(a-b));
			break;
		case 3:
			System.out.println("3.Multiplication :"+(a*b));
			break;
		case 4:
			System.out.println("4.Multiplication :"+(a/b));
			break;
			
		}
		
	}

}

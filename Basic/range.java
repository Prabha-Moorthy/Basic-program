import java.util.Scanner;
public class range{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		if(n>=1 & n<=50)
			System.out.println("The number is in the lower half");
		else if(n>=50 & n<=100)
			System.out.println("The number is in tha upper half");
		else if(n>100)
			System.out.println("Invalid number");
	}
}

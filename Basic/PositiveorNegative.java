import java.util.Scanner;
public class PositiveorNegative{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a=sc.nextInt();
		if(a>0){
			System.out.println("The number is positive");
		}
		else if(a<0){
			System.out.println("The number is negative");
		}
		else{
			System.out.println("The number is zero");
		}
	}
}

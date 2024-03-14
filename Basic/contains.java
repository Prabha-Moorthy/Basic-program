import java.util.Scanner;
public class contains{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Statement");
		String a=sc.nextLine().toLowerCase();
		if(a.contains("java"))
			System.out.println("The string contains java");
		else
			System.out.println("The string does not contains java");
	}
}

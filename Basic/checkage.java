import java.util.Scanner;
public class checkage{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		if(age>=18)
			System.out.println("your an adult");
		else
			System.out.println("your not yet an adult");
	}
}

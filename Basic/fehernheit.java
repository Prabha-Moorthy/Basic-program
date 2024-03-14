import java.util.Scanner;
public class fehernheit{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your value:");
		float cal=sc.nextFloat();
		float far=((cal*9/5)+32);
		System.out.println("Value of Fehernheit:"+far);
	}
}

import java.util.Scanner;
public class StringReversewithoutBuiltinFunction{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		for(int i=str.length()-1;i>=0;i--){
			System.out.println(str.charAt(i));
		}
	}
}

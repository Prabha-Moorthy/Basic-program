import java.util.Scanner;
import java.util.Random;
public class randomnum{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		int max=100;
		int n;
		n=rand.nextInt(max);
		System.out.println(n);
		int count=0;
		while(true){
			System.out.println("Enter the number");
			int guess=sc.nextInt();
			if (guess>n){
				System.out.println("Too High");
				count++;
			}
			else if(guess<n){
			      System.out.println("Too Low");
	      		      count++;
			}
			else{
				System.out.println("Correct Answer");
break;
			}
		}
		System.out.println(count);
	}
}




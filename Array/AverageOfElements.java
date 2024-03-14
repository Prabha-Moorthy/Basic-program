import java.util.Scanner;
public class AverageOfElements{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element:");
		int n=sc.nextInt();
		int sum=0;
		int num[]=new int[n];
		System.out.println("Enter the variable:");
		for(int i=0;i<n;i++){
			num[i]=sc.nextInt();
			}
			for(int i=0;i<num.length;i++){
			sum=sum+num[i];
			}
			int avg=sum/n;
			System.out.println("The sum of values:"+avg);
	}
}

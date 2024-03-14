import java.util.Scanner;

public class Commonelement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the array 1");
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the array 2");
		for(int i=0;i<n;i++) {
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j])
					System.out.println(arr1[i]);
			}
		}
	}

}

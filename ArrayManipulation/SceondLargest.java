import java.util.Scanner;
public class SceondLargest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			arr [i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				}
			}
		}
		System.out.println(arr[1]);
	}
}


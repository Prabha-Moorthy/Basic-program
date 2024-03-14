import java.util.*;
public class DistinctNumber{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value:");
	int n=sc.nextInt();
	int arr[]=new int[n];
	int res[]=new int[n];
	int count=0;
	System.out.println("Enter the elements:");
	for(int i=0;i<n;i++){
	arr[i]=sc.nextInt();	
	}
	System.out.println("The distinct elements:");
	for(int i=0;i<arr.length;i++){
	boolean flag=true;
	for(int j=0;j<arr.length;j++){
	if(i!=j && arr[i]==arr[j]){
	flag=false;
	}
	}
	if(flag)
	res[count++]=arr[i];	
	}
	System.out.println(Arrays.toString(res));
	}
	}


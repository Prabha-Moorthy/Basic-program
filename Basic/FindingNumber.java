import java.util.Scanner;
public class FindingNumber{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value:");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter the elements:");
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int min=arr[0];
int max=arr[0];
for(int i=0;i<arr.length;i++){
if(min>arr[i])
min=arr[i];
if(max<arr[i])
max=arr[i];
}
System.out.println("Largest Number is:"+min);
System.out.println("Smallest Numbar is:"+max);
}
}


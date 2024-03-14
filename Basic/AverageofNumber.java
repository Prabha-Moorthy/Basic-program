import java.util.Scanner;
public class AverageofNumber{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements:");
int n=sc.nextInt();
int sum=0;
int num[]=new int[n];
for(int i=0;i<n;i++)
{
num[i]=sc.nextInt();
sum=sum+num[i];
}
int avg=sum/n;
System.out.println("The Average is:"+avg);
}
}


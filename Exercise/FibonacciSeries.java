import java.util.Scanner;
public class FibonacciSeries{
public static void main(String args[]){
int n1=0,n2=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number:");
int n=sc.nextInt();
for(int i=0;i<n;i++){
System.out.println(n1+" ");
int n3=n1+n2;
n1=n2;
n2=n3;
}
}
}

import java.util.Scanner;
public class Multiplication{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value:");
int n=sc.nextInt();
for(int i=1;i<=20;i++){
System.out.println(i+"*"+n+"="+i*n);
}
}
}

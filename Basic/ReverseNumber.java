import java.util.Scanner;
public class ReverseNumber{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String:");
String s=sc.nextLine();
char[]ch=s.toCharArray();
for(int i=ch.length-1;i>=0;i--){
System.out.println(ch[i]);
}
}
}

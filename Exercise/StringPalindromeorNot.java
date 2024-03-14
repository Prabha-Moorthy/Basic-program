import java.util.Scanner;
public class StringPalindromeorNot{
static boolean flag;
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the word:");
String s=sc.nextLine().toLowerCase();
String str="";
//String str=s.replaceAll("\\s","");
for(int i=0;i<s.length();i++){
if(!(s.charAt(i)==' ')){
str=str+Character.toString(s.charAt(i));
}
}
int n=str.length();
for(int i=0;i<n/2;i++){
if(str.charAt(i)==str.charAt(n-i-1))
flag=true;
}
if(flag){
System.out.println("True");
}
else
System.out.println("False");
}
}




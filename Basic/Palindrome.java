import java.util.Scanner;
public class Palindrome{
static boolean flag;
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Word:");
String s=sc.nextLine();
int n=s.length();
String str="";
char ch[]=s.toCharArray();
for(int i=ch.length-1;i>=0;i--){
str=str+ch[i];
}
for(int i=0;i<s.length()-1;i++){
if(s.charAt(i)==str.charAt(i)){
flag = true;
continue;
}
else
flag=false;
}
if(flag)
System.out.println("This is Polindrome");
else
System.out.println("This is non Polindrome");
}
}

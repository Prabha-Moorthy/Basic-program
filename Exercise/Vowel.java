import java.util.Scanner;
public class Vowel{
static boolean flag;
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String s=sc.next().toLowerCase();
for(int i=0;i<s.length()-1;i++){
if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
flag=true;
break;
}
else
flag=false;
}
if(flag)
System.out.println("True");
else
System.out.println("False");
}
}


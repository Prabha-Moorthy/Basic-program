import java.util.Scanner;
public class RemoveCharacter{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string:");
	String s=sc.nextLine();
	System.out.println("The Removing Character is:");
	char ch=sc.next().charAt(0);
	String str=""+ch;
	str=str.toLowerCase();
	char sj=(char)((int)str.charAt(0)-32);
	System.out.println(sj);
	String res="";
	for(int i=0;i<s.length();i++)
	{
	if(s.charAt(i)!=str.charAt(0) && s.charAt(i)!=sj)
	{
	res+=Character.toString(s.charAt(i));
	}
	}
	System.out.println("After removing the character:"+res);
	}
}
	

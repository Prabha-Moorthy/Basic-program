import java.util.Scanner;
public class CountofWord{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		int count=1;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			if ((ch[i]==' ') && (ch[i+1]!=' ')){
				count++;
			}
		}
		System.out.println("The count of Words:"+count);
	}
}

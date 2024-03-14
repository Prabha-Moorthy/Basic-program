import java.util.Scanner;
public class NonRepeatedCharacter
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			boolean unique=true;
			for(int j=0;j<s.length();j++)
			{
				if(i!=j && s.charAt(i)==s.charAt(j))
					unique=false;
					break;
			}
			if(unique)
				System.out.println(s.charAt(i));
				break;
		}
	}
}		

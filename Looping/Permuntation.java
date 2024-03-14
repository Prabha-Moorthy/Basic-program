import java.util.Scanner;

public class Permuntation 
{   
	String permutation="";
	static public void stringPermutation(String input) 
	{
		System.out.println("Permutation of string: "+input);
		permutation("",input);
	}
		    private static void permutation(String permutation, String input) 
		    {
			    	if(input.length()==0)
		    		System.out.println(permutation);
		    	else {
		    		for(int i=0;i<input.length();i++) 
		    		{
		    			permutation(permutation+input.charAt(i),input.substring(0,i)+input.substring(i+1,input.length()));
		    		}
		    	}
		
	}
			public static void main(String[] args) 
			{
		        Scanner sc=new Scanner(System.in);
		        String s=sc.next();
		        stringPermutation(s);

		    }

	}

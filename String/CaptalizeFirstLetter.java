

import java.util.Scanner;

public class CaptalizeFirstLetter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String result="";
		Scanner scan=new Scanner(s);
		while(scan.hasNext()) {
			String word=scan.next();
			result=result+Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
			
		}
		System.out.println(result);
	}

}

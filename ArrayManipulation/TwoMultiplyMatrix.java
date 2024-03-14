import java.util.Scanner;

public class TwoMultiplyMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		int b[][]=new int[row][col];
		int c[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				c[i][j]=0;
				c[i][j]+=a[i][j]*b[i][j];
			
		}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
			System.out.println(c[i][j]);
			}
		}
	}

}

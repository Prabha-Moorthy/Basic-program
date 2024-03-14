import java.util.*;
public class SmallestSubarray{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] res=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
			}
		int currentLen=1,maxlen=Integer.MAX_VALUE;
		int start=0,end=0;
		for(int i=1;i<a.length;i++){
			if(a[i]>a[i-1]){
			currentLen++;
			}
		else{
			if(currentLen<maxlen){
				maxlen=currentLen;
				end=i-1;
				start=(end-maxlen)+1;
				}
			currentLen=1;
			}
		}
			if(currentLen<maxlen && currentLen>1){
				maxlen=currentLen;
				end=a.length-1;
				start=(end-maxlen)+1;
			}
		System.arraycopy(a,start,res,0,maxlen);
		System.out.println(Arrays.toString(Arrays.copyOf(res,maxlen)));
	}
}

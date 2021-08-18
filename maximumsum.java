package tcsnqt;
import java.util.*;
import java.lang.Math;
public class maximumsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		System.out.println(maxsum(arr,N));

	}
	public static int maxsum(int arr[],int n) {
		int res=0;
		for(int i=0;i<n;i++) {
			int curr=0;
			for(int j=i;j<n;j++) {
				curr=curr+arr[j];
				res=Math.max(res, curr);
			}
		}
		return res;
	}

}

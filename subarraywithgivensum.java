package tcsnqt;
import java.util.*;
public class subarraywithgivensum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int T=0;
		T=sc.nextInt();
		int N,S;
		
		
	
		for(int t=0;t<T;t++) {
			N=sc.nextInt();
			S=sc.nextInt();
			
			int arr[]=new int[N];
			
			for(int j=0;j<N;j++) {
				arr[j]=sc.nextInt();
			}
			subArray(arr,N,S);
		}

	}
	public static void subArray(int arr[],int N,int S) {
		int currSum;
		for(int i=0;i<N;i++) {
			currSum=arr[i];
			for(int j=i+1;j<=N;j++) {
				if(currSum==S) {
					System.out.print(i+1+" ");
					System.out.print(j);
					return;
				}
				if(currSum>S) {
					break;
				}
				else {
					currSum+=arr[j];
				}
				
			}
		}
		
		System.out.println("-1");
	}

}

package tcsnqt;
import java.util.*;
public class primenumberstilln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int flag=0,count=0;
		int n=sc.nextInt();
		for(int i=2;i<n;i++) {
			flag=1;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=0;
					break;
				}
	
			
			}
			
			if(flag==1) {
				count++;
				System.out.println(i+"  is a prime number");
			}
			
			}
		System.out.println("the number of prime numbers are:"+count);
		
		
	
	}

}

//  0 0 2 1 4 2 6 3 8 4

package tcsnqt;
import java.util.*;
public class series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,a=0,b=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		n=sc.nextInt();
		
		for(i=0;i<n;i++) {
			if(i%2!=0) {
				if(i>1)
				a=a+2;
			}
			else
				b=a/2;
		}
		if(n%2!=0)
			System.out.println(a);
		else
			System.out.println(b);

	}

}

//  1,1,2,3,4,9,8,27,16,81,32,243,64,729
package tcsnqt;
import java.io.*;
import java.util.*;
public class series2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,a=1,b=1,i;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<=n;i++)
{
	if(i%2!=0) {
		if(i==1) {
			a=1;
			System.out.println(a);
		}
		else {
		a=a*2;
		System.out.println(a);
		
		}
		
	}
	else {
		if(i==1) {
			b=1;
			System.out.println(b);}
		else
		{
		b=b*3;
		System.out.println(b);
		}
	}
}
if(n%2!=0)
	System.out.println(a);
else
	System.out.println(b);

	}
}

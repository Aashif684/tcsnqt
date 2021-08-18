package tcsnqt;

import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int flag=0,i;
		for(i=2;i<num;i++) {
			if(num%i==0)
				flag=1;
		}
		// TODO Auto-generated method stub
if(flag==0)
	System.out.println(num+" is a prime number");
else
	System.out.println(num+ " is  not a prime number");
	}

}

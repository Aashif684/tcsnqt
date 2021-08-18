package tcsnqt;
import java.io.*;
import java.util.*;

public class stringmanipuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		String c=sc.nextLine();
		
		char[] x=a.toCharArray();
		char[] y=b.toCharArray();
		
		
		int m,n,o;
		m=x.length;
		n=y.length;
		
		
		
		for(int i=0;i<m;i++) {
			if(x[i]=='a'||x[i]=='e'||x[i]=='i'||x[i]=='o'||x[i]=='u')
			{
				x[i]='%';
			}
			
		}
		for(int i=0;i<n;i++) {
			if(y[i]=='b'||y[i]=='c'||y[i]=='d'||y[i]=='f'||
					y[i]=='g'||y[i]=='h'||y[i]=='j'||y[i]=='k'||y[i]=='l'||
					y[i]=='m'||y[i]=='n'||y[i]=='p'||y[i]=='q'||y[i]=='r'||
					y[i]=='s'||y[i]=='t'||y[i]=='v'||y[i]=='w'||y[i]=='x'||y[i]=='y'||y[i]=='z') {
				y[i]='#';
			}
		}
		String s1="";
		for(int i=0;i<c.length();i++) {
		//	if(c>="a"&&c<="z") {
			
s1=c.toUpperCase();
			
		}
		
		
		 	
		
System.out.print(x);
System.out.print(y);
System.out.print(s1);

	}
	

}

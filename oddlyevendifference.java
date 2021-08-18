package tcsnqt;

import java.util.Scanner;

public class oddlyevendifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int num;
		    int rem,evensum=0,oddsum=0,diff=0;
		    System.out.println("enter the number");
		    Scanner sc=new Scanner(System.in);
		    num=sc.nextInt();
		    System.out.println("enter the number");
		    
		    while(num>0){
		      rem=num%10;
		    if(rem%2==0){
		        evensum+=rem;
		    }
		    else{
		        oddsum+=rem;
		    }
		    }
		  diff=oddsum-evensum;
		  System.out.println(diff);
		    
		}


	

}

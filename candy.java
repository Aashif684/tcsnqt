package tcsnqt;
import java.util.*;
public class candy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int M=sc.nextInt();
int N=10,K=5;
if(M>0 && M<=5) {
	System.out.println("Number of candies sold:"+M);
	System.out.println("Number of candies Available:"+(N-M));
}else {
	System.out.println("Invalid Input");
	System.out.println("Number of candies Available:"+N);
}
	}

}

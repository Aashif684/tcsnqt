package tcsnqt;
import java.util.*;
public class bucketproblem {
	static int mug,buck,c=0,cap;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		buck=sc.nextInt();
		mug=sc.nextInt();
if(mug>buck) {
	System.out.println("invalid inputs");
}
     cap=((8*buck)/10);
  

     c=cap/mug;
     System.out.println(c);
	}

}

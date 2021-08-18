package tcsnqt;
import java.util.*;
public class keywordproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"break","case","continue","default","defer"};
		int i,flag=0;
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		for(i=0;i<5;i++) {
			if(str.equals(s[i])) {
				flag=1;
				break;
			}
			
		}
		
		if(flag==1)
			System.out.println("keyword present");
		else
			System.out.println("not present");

	}

}

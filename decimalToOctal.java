package tcsnqt;
import java.util.*;

public class decimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int dec,octal=0;
int i=1;
System.out.println("enter the decimal number");
Scanner sc=new Scanner(System.in);
dec=sc.nextInt();
while(dec!=0) {
	octal+=(dec%8)*i;
	dec/=8;
	i*=10;
}
System.out.println("the octal value is:"+octal);
	}

}

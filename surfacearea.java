package tcsnqt;
import java.util.*;
public class surfacearea {
static int in_wall,ex_wall;
 static double in_surf=0.00,ex_surf=0.00,in_sum=0.00,ex_sum=0.00;
  static  double sum=0.00;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		in_wall=sc.nextInt();
		ex_wall=sc.nextInt();
		if(in_wall==0 ||ex_wall==0) {
			System.out.println("User may don't want to paint the walls");
		}
		double arr[]=new double[in_wall];
		for(int i=0;i<in_wall;i++)
		{
			arr[i]=sc.nextDouble();
			in_sum=in_sum+arr[i];
		}
		
		in_surf=18*in_sum;


		
		
		double arr1[]=new double[ex_wall];
	for(int j=0;j<ex_wall;j++)
		{
			arr1[j]=sc.nextDouble();
			ex_sum=ex_sum+arr1[j];
		}
		ex_surf=12*ex_sum;
		
		sum=in_surf+ex_surf;
		System.out.println("Total estimated Cost: "+sum);
		
	}

}

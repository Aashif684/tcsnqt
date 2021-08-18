package tcsnqt;
import java.util.*;
public class removevowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char []ch=s.toCharArray();

char[] num= {'a','e','i','o','u','A','E','I','O','U'};
int count[]= {0,0,0,0,0};
System.out.println(s);
for(int i=0;i<s.length();i++) {
	if(ch[i]=='a'||ch[i]=='A')
		count[0]++;
	else if(ch[i]=='e'||ch[i]=='E')
		count[1]++;
	else if(ch[i]=='i'||ch[i]=='I')
		count[2]++;
	else if(ch[i]=='o'||ch[i]=='O')
		count[3]++;
	else if(ch[i]=='u'||ch[i]=='U')
		count[4]++;
	
		
}
for(int i=0;i<5;i++) {
	System.out.println(num[i]+":"+count[i]);
}
for(int i=0;i<s.length();i++) {
	if(ch[i]!=num[0]&&ch[i]!=num[1]&&ch[i]!=num[2]&&ch[i]!=num[3]&&ch[i]!=num[4]&&ch[i]!=num[5]&&ch[i]!=num[6]&&ch[i]!=num[7]&&ch[i]!=num[8]&&ch[i]!=num[9]) {
		System.out.print(ch[i]);
	}
}
	}

}

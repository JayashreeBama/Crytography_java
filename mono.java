import java.util.*;
public class mono{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		int key=sc.nextInt();
	
		String en="";
		String de="";
		for(int i=0;i<a.length();i++){
			char n=a.charAt(i);
		
			en=en+ (char)((n+key+65)%26+65);
			char b=en.charAt(i);
			de=de+ (char)((b-key+65)%26+65);
		}
		System.out.println(en);
		System.out.println(de);
	}
}
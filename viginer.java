import java.util.*;
public class viginer{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		String key=sc.next();
		int len=key.length();	
		int j=0;
		String en="";
		String de="";
		for(int i=0;i<a.length();i++){
			char n=a.charAt(i);
			
			char p=key.charAt(j++  %len);

			System.out.print(p);
			en=en+ (char)((n-65+p)%26+65);
			char b=en.charAt(i);
			de=de+ (char)((b-p+65)%26+65);

		}
		System.out.println("\n"+en);
		System.out.println(de);
	}
}
import java.util.*;
public class rail
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int key=sc.nextInt();
		String s1="";
		int count=0;
		int p=0;
		int q=0;
		int min=Integer.MIN_VALUE;
		char ch[][]=new char[s.length()][s.length()];
		for(int i=0;i<key;i++){
		    q=0;
		    for(int j=i;j<s.length();j+=key){
		        
		        s1+=s.charAt(j);
		        ch[p][q++]=s.charAt(j);
		       // System.out.println(s.charAt(j));
		        count++;
		    }
		    p++;
		    min=Math.max(min,count);
		}
		
		System.out.println("Encrypted:");
		System.out.println(s1);
		//String s2="";
		System.out.println("Decrypted:");
		for(int i=0;i<min;i++){
		    for(int j=0;j<key;j++){
		        //s2+=ch[j][i];
		        System.out.print(ch[j][i]);
		    }
		}
		
	}
}
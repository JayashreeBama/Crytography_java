import java.util.*;
public class rsa{
public static int eucli(int a,int b){
int t1=0,t2=1,q=0,r=0,org=a,t=0;
while(b!=0){
	q=a/b;
	r=a%b;
	t=t1-(t2*q);
	a=b;
	b=r;
	t1=t2;
	t2=t;

}

	
if(t1>0){return t1;}
return org-t1;
}
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter p and q ");
	int p=sc.nextInt();
	int q=sc.nextInt();
	System.out.println("Enter e");
	int e=sc.nextInt();
	System.out.println("Enter Messasge to be encrypted");
	int m=sc.nextInt();
	int n=p*q;
	int pn=(p-1)*(q-1);

	int a=e,b=pn;
	if(a<pn){a=pn;b=e;}
	int d=eucli(a,b);
	System.out.println("public key "+e+" "+n);
	System.out.println("private key "+d+" "+n);
	System.out.println();
	System.out.println("Encrytion");

	int en=(int)Math.pow(m,e)%n;
	System.out.println(en);
	System.out.println();
	System.out.println("Decrytion");

	int de=(int)Math.pow(en,d)%n;
	System.out.println(de);
	}
}
import java.util.*;
public class diffie{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter p and g ");
int p=sc.nextInt();
int g=sc.nextInt();
System.out.println("Enter the private keys ");
int a=sc.nextInt();
int b=sc.nextInt();
int ya=(int)Math.pow(g,a)%p;
int yb=(int)Math.pow(g,b)%p;
System.out.println();
System.out.println("Ya = "+ya+" Yb = "+yb);
int k1=(int)Math.pow(yb,a)%p;
int k2=(int)Math.pow(ya,b)%p;
System.out.println();
System.out.println("Shared key ");
System.out.println("K1 = "+k1+" k2 = "+k2);
} 
}
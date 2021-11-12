import java.util.*;  
class roots
{
public static void main(String args[])   
{
float a, b, c, D;
double r1, r2;

System.out.println("Enter the values of a,b,c : ");
Scanner sc = new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();

D=(b*b)-4*a*c;
r1=(-b+Math.sqrt(D))/(2*a);
r2=(-b-Math.sqrt(D))/(2*a);

if(D>0)
{
System.out.println("The equation has real and distinct roots.");

System.out.println("The roots are " +r1 +"and " +r2);
}
else if(D==0)
{
System.out.println("The roots are real and equal");
System.out.println("The roots are " +r1 +"and " +r2);
}
else
{
System.out.println("The roots are imaginary");
}
}
}

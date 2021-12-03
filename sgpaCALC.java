import java.util.*;
public class sgpaCALC {

	public static void main(String[] args) {
		
		
		String name;
		String usn;
		float credits[]=new float[10];
		float marks[]=new float[10];
		float gp[]=new float [10];
		float sum=0, soc=0;
		int n,i=0;
		float sgpa;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		name = sc.nextLine();
		System.out.println("enter your USN : ");
		usn = sc.nextLine();
		System.out.println("enter number of subjects : ");
		n = sc.nextInt();
		
		for(i=0;i<n;i++) 
		{
			System.out.println("Enter marks and credits for subject" + i+1);
			marks[i]=sc.nextFloat();
			credits[i]=sc.nextFloat();
			soc=soc+credits[i];
			
			if (marks[i]>90 && marks[i]<=100) {
				gp[i]=10;
			}
			else if (marks[i]>80 && marks[i]<=90) {
				gp[i]=9;
			}
			else if (marks[i]>70 && marks[i]<=80) {
				gp[i]=8;
			}
			else if (marks[i]>60 && marks[i]<=70) {
				gp[i]=7;
			}
			else if (marks[i]>50 && marks[i]<=60) {
				gp[i]=6;
			}
			else if (marks[i]>=40 && marks[i]<=50) {
				gp[i]=5;
			}
			else {
				gp[i]=0;
			}
			
			sum = sum + (gp[i]*credits[i]);	
	}
		sgpa = sum/soc;
		System.out.println("SGPA is " + sgpa);
}
}

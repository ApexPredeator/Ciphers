import java.util.*;
import java.math.*; 
class conversion
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double ab=0,ba=0;
		String num1;
		int num,d,n,dec,dec1,i=0,j=0,k=0,ch=0;
		System.out.println("Enter binary number : ");
		num=sc.nextInt();	
		System.out.println("If there is any decimal part : ");
		num1=sc.next();
		System.out.println("Number is "+num+"."+num1);
		while(num!=0)
		{
			dec=num%10;
			ab=ab+dec*Math.pow(2,i);
			num=num/10;
			i++;
		}
		while(num1.charAt(k)=='0')
		{
			ch=ch+1;
			k=k+1;
		}
		n=Integer.parseInt(num1);
		d=n;
		while(n!=0)
		{	
			dec1=n%10;
			n=n/10;
			j++;
		}
		dec=0;
		j=j+ch;
		while(d!=0)
		{
			dec1=d%10;
			ba=ba+dec1*Math.pow(0.5,j);
			d=d/10;
			j--;
		}
		System.out.println(ab+ba);
	}
}
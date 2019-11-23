import java.util.*;
import java.math.*;
class rsa
{
	public static void main(String args[])
	{
		int k,ch2;
		int p,q,n,pn,msg,pk=0,d=0,l=0;              //pn is phi n
		double ct,pt;
		int ch,ch1;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER TWO PRIME NUMBERS");
		System.out.print("Enter 1st Number:");
		p=sc.nextInt();
		System.out.print("Enter 2nd Number:");
		q=sc.nextInt();
		System.out.print("Enter public key :");
		pk=sc.nextInt();
		ch=prime(p);
		ch1=prime(q);
		if(ch!=1||ch1!=1)
		{
			System.exit(0);
		}
		n=p*q;
		pn=(p-1)*(q-1);
		for(int i=0;i<pn;i++)
		{
			d=i;
			if(((d*pk)%pn)==1)
			break;
		}
		System.out.println("PRIVATE KEY :"+d);
		System.out.println("ENTER MESSAGE ");
		System.out.println("1.Numbers");
		System.out.println("2.Text");
		System.out.print("Enter your choice : ");
		ch2=sc.nextInt();
		switch(ch2)
		{
			case 1: System.out.print("Enter Message : ");
				msg=sc.nextInt();
				ct=Math.pow(msg,pk);
            				ct=ct%n; 
            				System.out.print("ENCRYPTED :"+ct);
				/*pt=Math.pow(ct,d);
            				pt=pt%n;
            				System.out.println("DECRYPTED :"+pt);*/
				break;
			case 2: System.out.print("Enter Message : ");
             				String msg1=sc.next();
             				int b=msg1.length();
             				char[] chars = msg1.toCharArray();
             				char[] enc=new char[b];
             				char c[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
             				int a[]=new int[b];
             				k=0;
             				for(int j=0;j<chars.length;j++)
				{
             					for(int i=0;i<c.length;i++)
					{
             						if(chars[j]==c[i])
              						{
                						a[k]=i;
	              						k=k+1;
                       					}
                         				}
                      			}
            				System.out.print("ENCRYPTED MESSAGE:");
				for(int i=0;i<a.length;i++)
				{
					l=a[i];
					ct=Math.pow(l,pk);
            					ct=ct%n; 
            					if(ct>26)
					{
             						enc[i]=c[(int)(ct%26)];
           						System.out.print(c[(int)(ct%26)]);
					} 
					else
					{
            						enc[i]=c[(int)ct];
            						System.out.print(c[(int)ct]);
            					}
				}
		}
	}
	static int prime(int a)
	{
		int f=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
			System.out.println(a+" is not a Prime Number");
			f = 1;
			return 0;
			}
		}
		if(f==0)
		return 1;
		return 1;
	}
}
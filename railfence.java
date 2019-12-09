import java.util.*;
class railfence
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String pt;
		int depth,ch;
		System.out.println("1. Encryption");
		System.out.println("2. Decryption");
		System.out.print("Enter your choice : ");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:	System.out.print("Enter PlainText(In lower Case): ");
				pt=sc.next();
				System.out.print("Enter depth of encryption : ");
				depth=sc.nextInt();
				String cta="";
				int r=depth;
				int len=pt.length();
				if(len%2!=0)
				{
					pt=pt+'x';
					len=pt.length();
				}
				int c=len/depth;
				char a[][]=new char[r][c];
				int k=0;
				for(int i=0;i< c;i++)
 				{
   					for(int j=0;j< r;j++)
   					{
    						if(k!=len)
							if(pt.charAt(k)=='x')
							{
								break;
							}
							else
							{
								a[j][i]=pt.charAt(k++);
   							}
					}
  				}
  				for(int i=0;i< r;i++)
  				{
   					for(int j=0;j< c;j++)
   					{
    						cta+=a[i][j];
   					}
  				}
				System.out.print(cta.toUpperCase());
				break;
			case 2:	System.out.print("Enter CipherText(In Upper Case) : ");
				pt=sc.next();
				pt=pt.toLowerCase();
				System.out.print("Enter depth of decryption : ");
				depth=sc.nextInt();
				String cta1="";
				int r1=depth;
				int len1=pt.length();
				if(len1%2!=0)
				{
					pt=pt+'x';
					len1=pt.length();
				}
				int c1=len1/depth;
				char a1[][]=new char[r1][c1];
				int k1=0;
				for(int i=0;i< r1;i++)
 				{
   					for(int j=0;j< c1;j++)
   					{
    						if(k1!=len1)
							if(pt.charAt(k1)=='x')
							{
								break;
							}
							else
							{
								a1[i][j]=pt.charAt(k1++);
   							}
   					}
  				}
  				for(int i=0;i< c1;i++)
  				{
   					for(int j=0;j< r1;j++)
   					{
    						cta1+=a1[j][i];
   					}
  				}
				System.out.print(cta1);		
		}
	}
}
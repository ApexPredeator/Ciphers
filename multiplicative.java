import java.util.*;
class multiplicative
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int key,key1=0,ch,ct,pt,l;
		String num;
		char t;
		char c[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		System.out.println("1. Encryption");
		System.out.println("2. Decryption");
		System.out.println("Enter your choice :");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:	System.out.print("Enter PlainText : ");		
				num=sc.next();
				num=num.toUpperCase();
				l=num.length();
				int k=0;
				int a[]=new int[l];
				char cte[]=new char[l];
				char[] num1=num.toCharArray();
				for(int j=0;j<num1.length;j++)
				{
             					for(int i=0;i<c.length;i++)
					{
             						if(num1[j]==c[i])
              						{
                						a[k]=i;
	              						k=k+1;
                       					}
                         				}
                      			}
				System.out.print("Enter Key :");
				key=sc.nextInt();
				System.out.print("Encrypted message :");
				for(int i=0;i<a.length;i++)
				{
					ct=(a[i]*key)%26;
					cte[i]=c[ct];
					System.out.print(cte[i]);
				}
				break;
			case 2:	System.out.print("Enter CipherText : ");		
				num=sc.next();
				num=num.toUpperCase();
				l=num.length();
				int k1=0;
				int a1[]=new int[l];
				char cte1[]=new char[l];
				char[] num2=num.toCharArray();
				for(int j=0;j<num2.length;j++)
				{
             					for(int i=0;i<c.length;i++)
					{
             						if(num2[j]==c[i])
              						{
                						a1[k1]=i;
	              						k1=k1+1;
                       					}
                         				}
                      			}
				System.out.print("Enter Key :");
				key=sc.nextInt();
				for(int i=0;i<26;i++)
				{
					key1=i;
					if((key*i)%26==1)
					break;
				}
				System.out.print("Decrypted message :");
				for(int i=0;i<a1.length;i++)
				{
					ct=(a1[i]*key1)%26;
					if(ct<0)
					{
						ct=ct+26;
					}
					cte1[i]=c[ct];
					System.out.print(cte1[i]);
				}
				break;
			default:	System.out.println("Wrong Choice");
		}
	}
} 
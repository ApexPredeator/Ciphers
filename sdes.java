import java.util.*;
class sdes
{
	public static void main(String args[])
	{
		String k,m;
		int i=9,temp=0;
		int key[]=new int[10];
		int key1[]=new int[10];
		int key2[]=new int[8];
		int key3[]=new int[8];
		int msg[]=new int[8];
		int ip[]=new int[8];
		int r[]=new int[4];
		int l[]=new int[4];
		int s0[]=new int[4];
		int s1[]=new int[4];
		int k1[]=new int[5];
		int k2[]=new int[5];
		int S0[][]={{1,0,2,3},{3,2,1,0},{0,2,1,3},{3,1,3,2}};
		int S1[][]={{0,1,2,3},{2,0,1,3},{3,0,1,0},{2,1,0,3}};
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 10 Bit key : ");
		k=sc.next();
		int lo=k.length();
		if(lo!=10)
		{
			System.out.println("Key is not accurate");
			System.exit(0);
		}
		for(int j=0;j<lo;j++)
		{
			key[j]=k.charAt(j);
			if(key[j]==48)
			{
				key[j]=0;
			}
			else
			{
				key[j]=1;
			}
		}
		key1[0]=key[2];
		key1[1]=key[4];
		key1[2]=key[1];
		key1[3]=key[6];
		key1[4]=key[3];
		key1[5]=key[9];
		key1[6]=key[0];
		key1[7]=key[8];
		key1[8]=key[7];
		key1[9]=key[5];
		for(int j=0;j<10;j++)
		{
			if(j<5)
			{
				k1[j]=key1[j];
			}
			else
			{
				k2[j-5]=key1[j];
			}
		}
		for(int j=0;j<5;j++)
		{
			if(j==4)
			{
				break;
			}
			else
			{
				temp=k1[j];
				k1[j]=k1[j+1];
				k1[j+1]=temp;
			}
		}
		for(int j=0;j<5;j++)
		{
			if(j==4)
			{
				break;
			}
			else
			{
				temp=k2[j];
				k2[j]=k2[j+1];
				k2[j+1]=temp;
			}
		}
		key[0]=k1[0];
		key[1]=k1[1];
		key[2]=k1[2];
		key[3]=k1[3];
		key[4]=k1[4];
		key[5]=k2[0];
		key[6]=k2[1];
		key[7]=k2[2];
		key[8]=k2[3];
		key[9]=k2[4];
		key2[0]=key[5];
		key2[1]=key[2];
		key2[2]=key[6];
		key2[3]=key[3];
		key2[4]=key[7];
		key2[5]=key[4];
		key2[6]=key[9];
		key2[7]=key[8];
		System.out.print("Key 1 : ");
		for(int j=0;j<8;j++)
		{
			System.out.print(key2[j]);
		}
		for(int j=0;j<5;j++)
		{
			if(j==4)
			{
				break;
			}
			else
			{
				temp=k1[j];
				k1[j]=k1[j+1];
				k1[j+1]=temp;
			}
		}
		for(int j=0;j<5;j++)
		{
			if(j==4)
			{
				break;
			}
			else
			{
				temp=k2[j];
				k2[j]=k2[j+1];
				k2[j+1]=temp;
			}
		}
		for(int j=0;j<5;j++)
		{
			if(j==4)
			{
				break;
			}
			else
			{
				temp=k1[j];
				k1[j]=k1[j+1];
				k1[j+1]=temp;
			}
		}
		for(int j=0;j<5;j++)
		{
			if(j==4)
			{
				break;
			}
			else
			{
				temp=k2[j];
				k2[j]=k2[j+1];
				k2[j+1]=temp;
			}
		}
		key[0]=k1[0];
		key[1]=k1[1];
		key[2]=k1[2];
		key[3]=k1[3];
		key[4]=k1[4];
		key[5]=k2[0];
		key[6]=k2[1];
		key[7]=k2[2];
		key[8]=k2[3];
		key[9]=k2[4];
		key3[0]=key[5];
		key3[1]=key[2];
		key3[2]=key[6];
		key3[3]=key[3];
		key3[4]=key[7];
		key3[5]=key[4];
		key3[6]=key[9];
		key3[7]=key[8];
		System.out.print("\nKey 2 : ");
		for(int j=0;j<8;j++)
		{
			System.out.print(key3[j]);
		}
		System.out.print("\nEnter 8 Bit Message : ");
		m=sc.next();
		int lo1=m.length();
		if(lo1!=8)
		{
			System.out.println("Key is not accurate");
			System.exit(0);
		}
		for(int j=0;j<lo1;j++)
		{
			msg[j]=m.charAt(j);
			if(msg[j]==48)
			{
				msg[j]=0;
			}
			else
			{
				msg[j]=1;
			}
		}
		ip[0]=msg[1];
		ip[1]=msg[5];
		ip[2]=msg[2];
		ip[3]=msg[0];
		ip[4]=msg[3];
		ip[5]=msg[7];
		ip[6]=msg[4];
		ip[7]=msg[6];
		for(int j=0;j<8;j++)
		{
			if(j<4)
			{
				l[j]=ip[j];
			}
			else
			{
				r[j-4]=ip[j];
			}
		}
		msg[0]=r[3];
		msg[1]=r[0];
		msg[2]=r[1];
		msg[3]=r[2];
		msg[4]=r[1];
		msg[5]=r[2];
		msg[6]=r[3];
		msg[7]=r[0];
		for(int j=0;j<8;j++)
		{
			if(msg[j]==key2[j])
			{
				msg[j]=0;
			}
			else
			{
				msg[j]=1;
			}
		}
		for(int j=0;j<8;j++)
		{
			if(j<4)
			{
				s0[j]=msg[j];
			}
			else
			{
				s1[j-4]=msg[j];
			}
		}
		int ro=2*s0[0]+s0[3];
		int co=2*s0[1]+s0[2];
		int ro1=2*s1[0]+s1[3];
		int co1=2*s1[1]+s1[2];
		s0[0]=(S0[ro][co])/2;
		s0[1]=(S0[ro][co])%2;
		s0[2]=(S1[ro1][co1])/2;
		s0[3]=(S1[ro1][co1])%2;
		s1[0]=s0[1];
		s1[1]=s0[3];
		s1[2]=s0[2];
		s1[3]=s0[0];
		for(int j=0;j<4;j++)
		{
			if(s1[j]==l[j])
			{
				s1[j]=0;
			}
			else
			{
				s1[j]=1;
			}
		}
		System.out.print("Encrypted message after 1st round : ");
		for(int j=0;j<4;j++)
		{
		System.out.print(r[j]);
		msg[j]=r[j];
		}
		for(int j=0;j<4;j++)
		{
		System.out.print(s1[j]);
		msg[j+4]=s1[j];
		}
		//ROUND2
		for(int j=0;j<8;j++)
		{
			if(j<4)
			{
				l[j]=msg[j];
			}
			else
			{
				r[j-4]=msg[j];
			}
		}
		msg[0]=r[3];
		msg[1]=r[0];
		msg[2]=r[1];
		msg[3]=r[2];
		msg[4]=r[1];
		msg[5]=r[2];
		msg[6]=r[3];
		msg[7]=r[0];
		for(int j=0;j<8;j++)
		{
			if(msg[j]==key3[j])
			{
				msg[j]=0;
			}
			else
			{
				msg[j]=1;
			}
		}
		for(int j=0;j<8;j++)
		{
			if(j<4)
			{
				s0[j]=msg[j];
			}
			else
			{
				s1[j-4]=msg[j];
			}
		}
		int ro2=2*s0[0]+s0[3];
		int co2=2*s0[1]+s0[2];
		int ro3=2*s1[0]+s1[3];
		int co3=2*s1[1]+s1[2];
		s0[0]=(S0[ro2][co2])/2;
		s0[1]=(S0[ro2][co2])%2;
		s0[2]=(S1[ro3][co3])/2;
		s0[3]=(S1[ro3][co3])%2;
		s1[0]=s0[1];
		s1[1]=s0[3];
		s1[2]=s0[2];
		s1[3]=s0[0];
		for(int j=0;j<4;j++)
		{
			if(s1[j]==l[j])
			{
				s1[j]=0;
			}
			else
			{
				s1[j]=1;
			}
		}
		System.out.print("\n");
		System.out.print("Encrypted message after 2nd round : ");
		for(int j=0;j<4;j++)
		{
		System.out.print(r[j]);
		msg[j]=r[j];
		}
		for(int j=0;j<4;j++)
		{
		System.out.print(s1[j]);
		msg[j+4]=s1[j];
		}
	}
}
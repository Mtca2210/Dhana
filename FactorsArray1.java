import java.util.*;
class FactorsArray1
{
	public static void main(String[] args) 
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter a number:");
		num=sc.nextInt();
		int size=(int)num/2;
		int[] FA=new int[size];
		int i,count=0;
		for(i=1;i<num;i++)
		{
			if(num%i==0)
				{
				FA[count]=i;
				count=count+1;
				System.out.print(i+" ");
				}
		}
		System.out.println("\n Total factors of  "+num+" : "+count);
		for(int j=0;j<count;j++)
			System.out.print(FA[j]+"");
	}
}

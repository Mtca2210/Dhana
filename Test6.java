 import java.util.Scanner;
 class Test6{
	 public static int sumDigit(int n )//n1=12345
	  {
		  int sum=0;
		  while(n>0)
		  {
			  sum=sum+n%10;
			  n=n/10;
			  }//while
			  return sum;
	  }
	public static void main(String[] args){
    Number ob1=new Number();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int temp=sc.nextInt();
	int res=ob1.sumDigit(temp);
	System.out.println("sum of digits of "+temp+" is "+res);
}
}

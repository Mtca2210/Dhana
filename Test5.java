 import java.util.Scanner;
 class Number
 {
	 private int n1;
	 public void setn1(int n1)
	 {
	 this.n1=n1;
 }//setn1
     public int getn1()
	 {
	 return n1;
	  }//getn1
	  public int reverseDigit()//n1=12345
	  {
		  int sum=0;
		  int n1=this.n1;
		  while(n1>0)
		  {
			  sum=sum*10+n1%10;
			  n1=n1/10;
			  }
			  return sum;
	  }//reverse
 }
	class Test7{
	public static void main(String[] args){
    Number ob1=new Number();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int temp=sc.nextInt();
	ob1.setn1(temp);
	int res=ob1.sumDigit();
	System.out.println("sum of digits of"+ob1.getn1()+" is "+res);
	res=ob1.reverseDigit();
	System.out.println("reverse of digits of "+ob1.get1()+" is "+res);
}
}

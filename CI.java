 import java.util.*;
 class CI{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		double principle,rate,time;
		principle=sc.nextDouble();
		rate=sc.nextDouble();
		time=sc.nextDouble();
		double CI=principle*Math.pow((1+rate/100),time);
		System.out.println("Compound Interest="+CI);
	}
}

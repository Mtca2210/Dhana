class Bank 
{
	int getRateOfInterest(){return 0;}
}
class SBI extends Bank
{
	int getRateOfInterest(){return 8;}
}
class ICICI extends Bank
{
	int getRateOfInterest(){return 7;}
}
class Axis extends Bank
{
	int getRateOfInterest(){return 6;}
}
class Test
{
	public static void main(String[] args) 
	{
		SBI s=new SBI();
		ICICI i=new ICICI();
		Axis a=new Axis();
		
}

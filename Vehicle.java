class  Vehical
{
	void run(){
		System.out.println("Vehicle is running");
	}
}
    class  Bike2 extends Vehical
    {
		void run()
		{
			System.out.println("Bike is running");
		}
	public static void main(String[] args) 
	{
		Bike2 obj=new Bike2();
	    obj.run();
	}
	}
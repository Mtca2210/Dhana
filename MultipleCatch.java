class  MultipleCatch{
	public static void main(String[] args) 
	{
		try
			{
			int a[]=new int[5];
			a[5]=30/0;
			}
			catch(ArithmeticException e)
		{
				System.out.println("ArithmaticException occurs");
		}
			catch(ArrayIndexOutOfBoundsException e)
		{
				System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(Exception e)
		{
			System.out.println("parent Exception occurs");
		}
		System.out.println("rest of the code");
	}
}                                                                                                                                                                                                                                                                                                                                                                                                

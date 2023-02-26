class scope_example4
{
	public static void main(String[] args)
{
		System.out.println("this is example to understand/Scope of variable");
		int i;
		i=15;
	{
		System.out.println("We are in new block");
		int j;
		j=i*i;
		System.out.println("i and j in new block are "+i+""+j);
		int k;
		k=i+2;
		j=k+100;
		System.out.println("i and j out of the new block are "+i+""+j);
	}
}
}
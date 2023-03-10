class TestArray 
{
	static void min(int arr[])
	{
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
			if(min>arr[i]);
			min=arr[0];
		System.out.println(min);
	}
	public static void main(String[] args) 
	{
		int a[]={33,4,3,5};
		min(a);
	}
}

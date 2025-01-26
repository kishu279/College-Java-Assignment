// Java program to swap two numbers
class GFG {
	static void swap(int a, int b) 
	{
        a = a + b;
        b = a - b;
        a = a - b;

		System.out.println("Value of a in swap function "+ a);
		System.out.println("Value of b in swap function "+ b);
		return;
	}

	public static void main(String[] args)
	{
		int a = 5;
		int b = 10;
	
		// original value of a and b
		System.out.println("Value of the a "
						+ a +  " b " + b); 
		
        // swap the numbers
		swap(a, b);

		System.out.println("Value of the a " + a + " b " + b);
	}
}

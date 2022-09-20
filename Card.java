class Card{
	static String type="Rainbow";
	static double height=3;
	static double width=8.9;
	static double price=9734;
	static String[] colour={"a","b","d"};
	
	static void printDetails()
	{
		System.out.println(type);
		System.out.println(height);
		System.out.println(width);
		System.out.println(price);
		if (colour!=null)
		{
			System.out.println("arrey is pointing to memory adress of colour");
			System.out.println("no of colours:"+colour.length);
			for (int index=0;index<colour.length;index++)
			{
				String ref=colour[index];
				System.out.println(ref);
			}
		}
		else 
		{
			System.out.println("Arrey is not pointing to memory");
		}
	}
}
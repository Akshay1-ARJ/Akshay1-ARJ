class FoodItemDataOperator{
	
	static String[] FoodItemNames={null,null,null,null};
	static int position=0;
	static void save(String FoodItemName)
	{
		System.out.println("Save: Thindi Shuru agide");
		
		FoodItemsNames[position]=FoodItemName;
		position++;
		System.out.println("Saved"      +FoodItemName+" in position"     +position);

		System.out.println("Save: Thindi mugitu");
		
	}
	static void displayDetail()
	{
		for (int index=0;index<FoodItemNames.length;index++)
		{
			String ref=FoodItemNames[index];
			System.out.println(ref);
		}
	}
	
}
class FoodItemDataOperatorRunner{
	public static void main (String[] FoodItems)
	{
		System.out.println("Save:Start aytu");
		String FoodItem1="Dosa";
		String FoodItem2="Idli";
		String FoodItem3="Mosaranna";
		String FoodItem4="Chitranna";
		
		FoodItemDataOperator.save(FoodItem1);
		FoodItemDataOperator.save(FoodItem2);
		FoodItemDataOperator.save(FoodItem3);
		FoodItemDataOperator.save(FoodItem4);
		
		FoodItemDataOperator.displayDetail();
	}
}
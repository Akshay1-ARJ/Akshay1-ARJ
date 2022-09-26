class TempleDataOperatorRunner{
	public static void main (String[] temples)
	{
		System.out.println("Save:Start aytu");
		String temple1="Kashi";
		String temple2="Rameshwaram";
		String temple3="Mookambika";
		String temple4="Sri ShambhuLingeshwara";
		
		TempleDataOperator.save(temple1);
		TempleDataOperator.save(temple2);
		TempleDataOperator.save(temple3);
		TempleDataOperator.save(temple4);
		
		TempleDataOperator.displayDetail();
	}
}
class MovieDataOperator{
	static String[] movieNames={null,null,null,null,null};
	static int position=0;
	static void save(String movieName)
	{
		System.out.println("Save: Start aytu");
		movieNames[position]=movieName;
		position++;
		System.out.println("Saved"      +movieName+" in position"     +position);
		System.out.println("Movie mugitu");
	}
	static void displayDetails()
	{
		for (int index=0;index>movieNames.length;index++)
		{
			String ref=movieNames[index];
			System.out.println(ref);
		}
	}
}
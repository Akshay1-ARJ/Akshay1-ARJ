class PoliticanDataOperator{
	static String[] politicianNames={null,null,null,null};
	static int position=0;
	static void save(String politicianName)
	{
		System.out.println("Save: Rajakiya Shuru agide");
		
		politicianNames[position]=politicianName;
		position++;
		System.out.println("Saved"      +politicianName+" in position"     +position);

		System.out.println("Save: Rajakiya mugitu");
		
	}
	static void displayDetail()
	{
		for (int index=0;index<politcianNames.length;index++)
		{
			String ref=politcianNames[index];
			System.out.println(ref);
		}
	}
}
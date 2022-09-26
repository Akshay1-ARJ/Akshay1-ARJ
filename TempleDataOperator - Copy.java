class TempleDataOperator{
	
	static String[] templeNames={null,null,null,null};
	static int position=0;
	static void save(String templeName)
	{
		System.out.println("Save: Thirtha yatre Shuru agide");
		
		templeNames[position]=templeName;
		position++;
		System.out.println("Saved"      +templeName+" in position"     +position);

		System.out.println("Save: Thirtha yatre mugitu");
		
	}
	static void displayDetail()
	{
		for (int index=0;index<templeNames.length;index++)
		{
			String ref=templeNames[index];
			System.out.println(ref);
		}
	}
	
}
class GraduateDataOperator{
	
	static String[] GraduateNames={null,null,null,null};
	static int position=0;
	static void save(String GraduateName)
	{
		System.out.println("Save: start agide");
		
		GraduateNames[position]=GraduateName;
		position++;
		System.out.println("Saved"      +GraduateName+" in position"     +position);

		System.out.println("Save: Thirtha yatre mugitu");
		
	}
	static void displayDetail()
	{
		for (int index=0;index<GraduateNames.length;index++)
		{
			String ref=GraduateNames[index];
			System.out.println(ref);
		}
	}
	
}
class GraduateDataOperatorRunner{
	public static void main (String[] Graduates)
	{
		System.out.println("Save:Start aytu");
		String Graduate1="Kashi";
		String Graduate2="Rameshwara";
		String Graduate3="Mookambika";
		String Graduate4="Sri Sham";
		
		GraduateDataOperator.save(Graduate1);
		GraduateDataOperator.save(Graduate2);
		GraduateDataOperator.save(Graduate3);
		GraduateDataOperator.save(Graduate4);
		
		GraduateDataOperator.displayDetail();
	}
}
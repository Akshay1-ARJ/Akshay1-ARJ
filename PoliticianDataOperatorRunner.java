class PoliticianDataOperatorRunner{
	public static void main (String[] Politicians)
	{
		System.out.println("Save:Start aytu");
		String Politician1="Sardar Vallabhai patel";
		String Politician2="Lal Bahaddur Shastri";
		String Politician3="Atal Bihari Vajapeyi";
		String Politician4="Narendra Damodar Das Modi";
		
		PoliticianDataOperator.save(Politician1);
		PoliticianDataOperator.save(Politician2);
		PoliticianDataOperator.save(Politician3);
		PoliticianDataOperator.save(Politician4);
		
		PoliticianDataOperator.displayDetail();
	}
}
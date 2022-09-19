class Sports{
	static void cricketTeamMembers(String[] names)
	{
		System.out.println("Lets start Cricket");
		
		System.out.println("Total Cricket Team includes:"+names.length);
		
		for (int index=0;index<names.length;index++)
		{
			String ref= names[index];
			System.out.println("names:"+ref);
		}
	}
	static void kabbadiTeamMembersJerseyNos(int[] numbers)
	{
		System.out.println("Lets Panga");
		System.out.println("Team Member Jerssy Numbers:"+numbers.length);
		for(int index=0;index<numbers.length;index++)
		{
			int ref=numbers[index];
			System.out.println("Numbers:"+ref);
		}
	}
	static void FootBallTeamMembersSalary(double[] salaries)
	{
		System.out.println("Lets Count Dollers insted of Stars");
		System.out.println("Total Number of Football players:"+salaries.length);
		for (int index=0;index<salaries.length;index++)
		{
			double ref=salaries[index];
			System.out.println("Salaries in Million Dolller:"+ref);
		}
	}
	static void ludoTeamMobileNumber(long[] number)
	{
		System.out.println("Dice game ");
		System.out.println("Ludo players Mobile number:"+number.length);
		for (int index=0;index<number.length;index++)
		{
			long ref=number[index];
			System.out.println("Ludo players Mobile Number:"+ref);
		}
		
	}
	static void hockeyTeamMembersNoOfMatches(int[] matches)
	{
		System.out.println("Hockey matches played ");
		System.out.println("Hockey matches played :"+matches.length);
		for (int index=0;index<matches.length;index++)
		{
			int ref=matches[index];
			System.out.println("Hockey matches played:"+ref);
		}
	}
	static void kokoTeamMembersCountryCode(String[] names)
	{
		System.out.println("koko team match players");
		System.out.println("Hockey players:" +names.length);
		for (int index=0;index<names.length;index++)
		{
			String ref=names[index];
			System.out.println("koko team players"+ref);
		}
	}
}
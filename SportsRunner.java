class SportsRunner{
	public static void main (String[] game)
	{
		String[] names={"Dhoni","Ganguli","Srisham","Yuvi","Bajji","Jadddu","Jontey","McCullum","Stokes"};
		Sports.cricketTeamMembers(names);
		
		System.out.println("--------------------------------------");
		
		int[] numbers={1,99,68,12,72,6,23,1,67,18};
		Sports.kabbadiTeamMembersJerseyNos(numbers);
		
		System.out.println("--------------------------------------");
		
		double[] salaries={62d,41d,36.5d,36d,34d,31d,26d,26d,24d,24d};
		Sports.FootBallTeamMembersSalary(salaries);
		
		System.out.println("--------------------------------------");
		
		long[] number={8277738399L,9481064199L,9480954699L};
		Sports.ludoTeamMobileNumber(number);
		
		System.out.println("--------------------------------------");
		
		String[] hnames={"AAA","bbb","ccc","dfdf","dfhd"};
		Sports.kokoTeamMembersCountryCode(hnames);
	}
}
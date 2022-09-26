class MovieDataOperatorRunner
{
	public static void main (String[] movies )
	{
		System.out.println("Movie start aytu");
			String movie1="Fast and Furious1";
			String movie2="Fast and Furious2";
			String movie3="Fast and Furious3";
			String movie4="Fast and Furious4";
			String movie5="Fast and Furious5";
		
		
		MovieDataOperator.save(movie1);
		MovieDataOperator.save(movie2);
		MovieDataOperator.save(movie3);
		MovieDataOperator.save(movie4);
		MovieDataOperator.save(movie5);
		MovieDataOperator.displayDetails();
		
	}
}   
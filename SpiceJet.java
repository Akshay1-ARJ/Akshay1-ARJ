class SpiceJet{
	 static void Fly (String[] Aeroplane)
	{
		System.out.println("Aeroplane takeoff ");
		
		System.out.println("Total SpiceJets are :"+ Aeroplane.length);
		for (int index=0;index<Aeroplane.length;index++)
		{
			String ref=Aeroplane[index];
			System.out.println("Aeroplane"+ref);
		}
			System.out.println("Aeroplane landing");
	}
}
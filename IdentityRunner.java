class IdentityRunner{
	
	public static void main(String[] ID)
	{
		System.out.println("=============================");
		System.out.println("Identity Runner Main....");
		System.out.println("=============================");
		
		String rName = "advik"; 		    String rEmail = "advik@gmail.com";
		String rAddress = "Bangalore";  	byte rAge = 6;
		char rGender = 'M';	 				boolean rWorkStatus = false; 
		byte rShirtSize = 4;				byte rPantSize = 10;
		float rWt = 18f; 					float rHt = 112f;
		long rContactNum = 9986812821L;
				
		for(byte person=0;person<=12;person++)
		{		
				if(person==0)
				{
					System.out.println("First persons details");
				}
				//------------------------------------1st person
				if (person==1)
				{
				rName = "sanjay"; 		    rEmail = "sanjay@gmail.com";
				rAddress = "Mangalore";  	rAge = 16;
				rGender = 'M';	 			rWorkStatus = true; 
				rShirtSize = 39;			rPantSize = 32;
				rWt = 78f; 					rHt = 165f;
				rContactNum = 9099876765L;
				}
				//------------------------------------2nd person
				if (person==2)
				{
				rName = "pavan"; 		    rEmail = "pavan@gmail.com";
				rAddress = "Mandya";  		rAge = 12;
				rGender = 'M';	 			rWorkStatus = false; 
				rShirtSize = 26;			rPantSize = 26;
				rWt = 45f; 					rHt = 124f;
				rContactNum = 9012122221L;
				}
				if (person==3)
				{
				rName = "charan"; 		    rEmail = "charan@gmail.com";
				rAddress = "bombay";  		rAge = 52;
				rGender = 'M';	 			rWorkStatus = false; 
				rShirtSize = 42;			rPantSize = 34;
				rWt = 68f; 					rHt = 178f;
				rContactNum = 99999999999L;
				}
				if (person==4)
				{
				rName = "chinmayee"; 		    rEmail = "chimayee@gmail.com";
				rAddress = "bombay";  		rAge = 34;
				rGender = 'F';	 			rWorkStatus = true; 
				rShirtSize = 36;			rPantSize = 30;
				rWt = 56f; 					rHt = 178f;
				rContactNum = 8989787656L;
				}
				if (person==5)
				{
				rName = "arpita"; 		    rEmail = "arpita@gmail.com";
				rAddress = "gangavati";  		rAge = 22;
				rGender = 'F';	 			rWorkStatus = true; 
				rShirtSize = 28;			rPantSize = 30;
				rWt = 40f; 					rHt = 150f;
				rContactNum = 9986952330L;
				}
				if (person==6)
				{
				rName = "akshata"; 		    rEmail = "akshata@gmail.com";
				rAddress = "delhi";  		rAge = 38;
				rGender = 'F';	 			rWorkStatus = true; 
				rShirtSize = 38;			rPantSize = 32;
				rWt = 67f; 					rHt = 156f;
				rContactNum = 654654664646L;
				}
				if (person==7)
				{
				rName = "dia"; 		    rEmail = "dia@gmail.com";
				rAddress = "bangalore";  		rAge = 40;
				rGender = 'F';	 			rWorkStatus = true; 
				rShirtSize = 40;			rPantSize = 36;
				rWt = 80f; 					rHt = 156f;
				rContactNum = 656464646747L;
				}
				if (person==8)
				{
				rName = "chithra"; 		    rEmail = "chithra@gmail.com";
				rAddress = "bangalore";  		rAge = 40;
				rGender = 'F';	 			rWorkStatus = false; 
				rShirtSize = 40;			rPantSize = 36;
				rWt = 60f; 					rHt = 166f;
				rContactNum = 69999999998L;
				}
				if (person==9)
				{
				rName = "anil"; 		    rEmail = "anil@gmail.com";
				rAddress = "Mysore";  		rAge = 40;
				rGender = 'M';	 			rWorkStatus = false; 
				rShirtSize = 40;			rPantSize = 36;
				rWt = 80f; 					rHt = 156f;
				rContactNum =8888546747L;
				}
				
				if (person==10)
				{
				rName = "ravi"; 		    rEmail = "ravi@gmail.com";
				rAddress = "Mysore";  		rAge = 40;
				rGender = 'M';	 			rWorkStatus = false; 
				rShirtSize = 40;			rPantSize = 36;
				rWt = 89f; 					rHt = 176f;
				rContactNum =8888546747L;
				}
				if (person==11)
				{
				rName = "gana"; 		    rEmail = "gana@gmail.com";
				rAddress = "USA";  		rAge = 40;
				rGender = 'F';	 			rWorkStatus = true; 
				rShirtSize = 40;			rPantSize = 36;
				rWt = 80f; 					rHt = 156f;
				rContactNum =8888546747L;
				}
				if (person==12)
				{
				rName = "ramu"; 		    rEmail = "ramu@gmail.com";
				rAddress = "Germany";  		rAge = 40;
				rGender = 'M';	 			rWorkStatus = false; 
				rShirtSize = 40;			rPantSize = 36;
				rWt = 80f; 					rHt = 156f;
				rContactNum =89889898989L;
				}
				//------------------------------------------------------
				//---------------------------------------------------------
				Identity.printName(rName);   				
				Identity.printNameAndEmail(rName,rEmail);	
				Identity.printNameAndAge(rName,rAge);		
				Identity.printNameAndAddress(rName,rAddress);
				Identity.printNameAndEmailAndAddressAndAge(rName,rEmail,rAddress,rAge);
				Identity.printNameAndGender(rName,rGender);
				Identity.printNameAndWorking(rName,rWorkStatus);
				Identity.printNameAndShirtSize(rName,rShirtSize);
				Identity.printNameAndPantSize(rName,rPantSize);
				Identity.printNameAndWeightAndHeight(rName,rWt,rHt);
				Identity.printNameAndMobile(rName,rContactNum);
				System.out.println("----------------------------------");
			
				
		}// end of for loop
		
	}//---------end of public static void main
	
}// end of class Identity runner
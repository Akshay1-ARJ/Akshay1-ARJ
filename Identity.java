class Identity{
	
	static void printName(String name)
	{
		System.out.println("Name : "+name);
	}
	
	static void printNameAndEmail(String name,String email)
	{
		System.out.println("Name : "+name+">>> Email: "+email);
	}
	
	static void printNameAndAge(String name,byte age)
	{
		System.out.println("Name : "+name+">>> Age:"+age+"Years");
	}

	static void printNameAndAddress(String name,String adress)
	{
		System.out.println("Name : "+name+">>> Address:"+adress);
	}
	
	static void printNameAndEmailAndAddressAndAge(String name,String email,String adress,byte age)
	{
		System.out.println("Name : "+name+">>> Email: "+email+">>> Address:"+adress+">>> Age:"+age+"Years");
	}

	static void printNameAndGender(String name,char gender)
	{
		System.out.println("Name : "+name+">>> Gender:"+gender);
	}
	static void printNameAndWorking(String name,boolean workStatus)
	{
		System.out.println("Name : "+name+">>> Employmentstatus-working:"+workStatus);
	}
	static void printNameAndShirtSize(String name,byte shirtsize)
	{
		System.out.println("Name : "+name+">>> ShirtSize:"+shirtsize);
	}
	static void printNameAndPantSize(String name,byte pantsize)
	{
		System.out.println("Name : "+name+">>> PantSize:"+pantsize);
	}
	static void printNameAndWeightAndHeight(String name,float wt,float ht)
	{
		System.out.println("Name : "+name+">>> Weight in kg: "+wt +">>> Height in cms:"+ht);
	}
	static void printNameAndMobile(String name,long mobileNum)
	{
		System.out.println("Name : "+name+">>> Contact No.:"+mobileNum);
	}
}
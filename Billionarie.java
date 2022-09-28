class Billionarie

{
	static String[] billionears={null,null,null,null,null,null,null,null,null,null};
	static int position=0;
	
	static void save(String opulent)
	{
		System.out.println("Billionarie are.......?");
		if(billionears.length>7)
		{
			System.err.println("billionear name exceed");
		}
		if(opulent!=null && opulent.length()>3)
		{
			billionears[position]=opulent;
			System.out.println("billionear name  " +opulent +"  position   " +position );
			position++;
		}
	}
	static void displayopulent1()
	{
		for(int index=0;index<billionears.length;index++)
		{
			String ref=billionears[index];
			System.out.println("opulent name :"+ref);
			
		}
	}
	static boolean findopulent(String opulent)
	{
		if(opulent!=null && opulent.length()>3)
		{
			System.out.println("array is valid");
			for (int find=0;find<billionears.length;find++)
			{
				String ref=billionears[find];
				if(ref==opulent)
				{
					System.out.println("opulent is found  :" +opulent );
					return true;
				}
			
			}
			
			
		}
		else
		{
			System.err.println("opulent is not found  "+opulent);
		}
		return false;
	}	
	static void updateopulent(String oldopulent,String newopulent)
	{
		if(oldopulent!=null && newopulent!=null && oldopulent.length()>3 && newopulent.length()>3)
		{
			System.out.println("oldopulent newopulent r valid we can update");
			{
				for(int index=0;index<billionears.length;index++)
				{
					String ref=billionears[index];
					if(ref==oldopulent)
					{
						billionears[index]=newopulent;
						
	
					}
				}
			}
		}
		else
		{
		    System.out.println("oldopulent newopulent r not valid we cannot update");	
		}
	}
	static void displayopulent2()
	{
		for(int index=0;index<billionears.length;index++)
		{
			String ref=billionears[index];
			System.out.println("opulent name :"+ref);
			
		}
	}	
	
	static String updateopulent(int position,String newopulent)
		{
			if(position<billionears.length && newopulent.length()>3)
			{
		      billionears[position]=newopulent;
		      return newopulent;	
		    }
		return null;
		}
	static void displayopulent3()
	{
		for(int index=0;index<billionears.length;index++)
		{
			String ref=billionears[index];
			System.out.println("opulent name :"+ref);
			
		}
	}
	static boolean deleteopulent(String opulent)
    {
		if(opulent!=null && opulent.length()>3)
		{
			System.out.println("data is valid");
			for(int index=0;index<billionears.length;index++)
				{
					String ref=billionears[index];
					if(ref==opulent)
					{
						billionears[index]=null;
						return true;
	
					}
				}
			
		}
		return false;
	} 
	static void displayopulent4()
	{
		for(int index=0;index<billionears.length;index++)
		{
			String ref4=billionears[index];
			System.out.println("opulent name :"+ref4);
			
		}
	}
	static boolean deleteopulent(int position,String opulent)
	{
			if(position<billionears.length && opulent.length()>3)
			{
		      billionears[position]=null;
		      return true;	
		    }
	
		
		if(opulent!=null && opulent.length()>3)
		{
			System.out.println("data is valid");
			for(int index=0;index<billionears.length;index++)
				{
					String ref=billionears[index];
					if(ref==opulent)
					{
						billionears[index]=null;
						return true;
	
					}
				}
			
	    }
		return false;
    }		
	static void displayopulent5()
	{
		for(int index=0;index<billionears.length;index++)
		{
			String ref5=billionears[index];
			System.out.println("opulent name :"+ref5);
			
		}
	}
	
		
}
		

	
	

	

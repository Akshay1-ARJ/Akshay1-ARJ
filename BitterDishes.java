class BitterDishes{
	
	public static void main(String[]Toxic)
	{
		String dish1  = "Pizza";
		String dish2  = "Burger";
		String dish3  = "Vegroll";
		String dish4  = "Cake";
		String dish5  = "Pannercholi";
		String dish6  = "Eggmasala";
		String dish7  = "Chickenmasala";
		String dish8  = "Chickencurry";
		String dish9  = "Eggcurry";
		String dish10 = "Mashroom";
		String dish11 = "Dalcurry";
		String dish12 = "Kajumasala";
		String dish13 = "Daltadak";
		String dish14 = "Vegtadak";
		String dish15 = "Panertadak";
		String dish16 = "Cheeseroll";
		String dish17 = "Chickenroll";
		String dish18 = "Eggroll";
		
		String [] ArunDishes = {dish1,dish10,dish11,dish13,dish12,dish14,dish15,dish16,dish18,dish17,dish2,dish3,dish4,dish5,dish6,dish7,dish8,dish9};
        int Count=ArunDishes.length;
	    System.out.println("The num of Dishes are :-" +Count);
		
		String Dish05= "Arun";
		ArunDishes[05]=Dish05;
		String Dish04= "Toxic";
		ArunDishes[04]=Dish04;
		String Dish03= "Introvert";
		ArunDishes[03]=Dish03;
		
		for (int list=0; list<ArunDishes.length; list++)
		{
			String ref=ArunDishes[list];
			System.out.println("Here Declaring the Dishes name :- "+ref);
		}
			
		
	}
}
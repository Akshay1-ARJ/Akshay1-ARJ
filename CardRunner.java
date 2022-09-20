class CardRunner{
	
	public static void main(String[] Rummy)
	{
		System.out.println("Main : Aata shuru agide");
		
		Card.printDetails();
		Card.type="ispit card";
		Card.height=6;
		Card.width=8.2;
		Card.price=156d;
		String[] color={"Red","Black"};
		Card.colour=color;
		
		Card.printDetails();
		
		System.out.println("Rummy show aytu");
	}
}
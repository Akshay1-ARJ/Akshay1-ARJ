class BillionarieRunner
{
public static void main(String[] shumos)
{
	Billionarie.save("Akshay");
	Billionarie.save("Om_sir");
	Billionarie.save("Omkar_sir");
	Billionarie.save("Omkareshwar_sir");
	Billionarie.save("shubham");
	Billionarie.save("darshan_kartik");
	Billionarie.save("shri_cave");
	Billionarie.save("jeff");
	Billionarie.save("buff");
	
	Billionarie.displayopulent1();
	
	Billionarie.findopulent("Akshay");
	
	Billionarie.updateopulent("dharshan_kartik","musk");
	Billionarie.displayopulent2();
	
	Billionarie.updateopulent(5,"qwerty");
	Billionarie.displayopulent3();
	
	Billionarie.deleteopulent("qwerty");
	Billionarie.displayopulent4();
	
	Billionarie.deleteopulent(1,"Om_sir");
	Billionarie.displayopulent5();
}

}
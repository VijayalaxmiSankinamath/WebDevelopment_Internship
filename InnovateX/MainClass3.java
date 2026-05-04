class Amazon {
	void buy()
		{
		System.out.println("shopping anything");
	    }
   }
class Shoes extends Amazon
{
	void buy(){
		System.out.println("shoes shopping");
	}
		
}
class Dress extends Amazon
{
	void buy(){
		System.out.println("Dress Shopping");
	}
}

class Mobiles extends Amazon
{
	void buy(){
		System.out.println("Mobile shopping");
	}
}

class Stimulator
{
	static void purchase(Amazon a1){
		a1.buy();
	}
}
class MainClass3
{
	public static void main(String[] args)
		{
		Shoes s1 = new Shoes();
		Dress d1 = new Dress();
		Mobiles m1 = new Mobiles();
		Stimulator.purchase(s1);
		Stimulator.purchase(d1);
		Stimulator.purchase(m1);
	}
}

class LG {
	void select()
		{
		System.out.println("Types of selecting");
	    }
   }
class Mobiles extends LG
{
	void select(){
		System.out.println("Mobile selecting");
	}
		
}
class Refrigirators extends LG
{
	void select(){
		System.out.println("Refrigirators");
	}
}

class Television extends LG
{
	void select(){
		System.out.println("Telivision");
	}
}

class Stimulator
{
	static void buy(LG l1){
		l1.select();
	}
}
class MainClass2
{
	public static void main(String[] args)
		{
		Mobiles m1 = new Mobiles();
		Refrigirators r1 = new Refrigirators();
		Television t1= new Television();
		Stimulator.buy(m1);
		Stimulator.buy(r1);
		Stimulator.buy(t1);
	}
}

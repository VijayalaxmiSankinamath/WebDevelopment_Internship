interface Mobiles
{
	void feature();
}
class Vivo implements Mobiles
{
	public void feature(){
		System.out.println("Camera");
	}
}
class Oppo implements Mobiles
{
	public void feature(){
		System.out.println("RAM");
	}
}
class Samsung implements Mobiles
{
	public void feature(){
		System.out.println("Cost effective");
	}
}
class Stimulator
{
	static void buy(Mobiles m1)
	{
		m1.feature();
	}
		
}
class MainFunction4
{
	public static void main(String[] args){
		Vivo v1 = new Vivo();
		Oppo o1 = new Oppo();
		Samsung s1 = new Samsung();
		Stimulator.buy(v1);
		Stimulator.buy(o1);
		Stimulator.buy(s1);
		
	}
		
}

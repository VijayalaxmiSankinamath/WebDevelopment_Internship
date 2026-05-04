interface Amazon
{
	void buy();
}
class Shoes implements Amazon
{
	public void buy(){
		System.out.println("Shoes shopping");
	}
}
class Dress implements Amazon
{
	public void buy(){
		System.out.println("Dress shopping");
	}
}
class Earbuds implements Amazon
{
	public void buy(){
		System.out.println("earbuds shopping");
	}
}
class Stimulator
{
	static void purchase(Amazon a1)
	{
		a1.buy();
	}
		
}
class MainFunction2
{
	public static void main(String[] args){
		Shoes s1 = new Shoes();
		Dress d1 = new Dress();
		Earbuds e1 = new Earbuds();
		Stimulator.purchase(s1);
		Stimulator.purchase(d1);
		Stimulator.purchase(e1);
	}
		
}

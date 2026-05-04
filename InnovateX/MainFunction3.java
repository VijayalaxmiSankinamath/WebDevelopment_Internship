interface Bank
{
	void feature();
}
class SBI implements Bank
{
	public void feature(){
		System.out.println("ATM");
	}
}
class Canara implements Bank
{
	public void feature(){
		System.out.println("Security");
	}
}
class Union implements Bank
{
	public void feature(){
		System.out.println("Trusted");
	}
}
class Stimulator
{
	static void See(Bank b1)
	{
		b1.feature();
	}
		
}
class MainFunction3
{
	public static void main(String[] args){
		SBI s1 = new SBI();
		Canara c1 = new Canara();
		Union u1 = new Union();
		Stimulator.See(s1);
		Stimulator.See(c1);
		Stimulator.See(u1);
		
	}
		
}

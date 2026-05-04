class Films
{
	void watch(){
		System.out.println("watching any movie");
	}
}
class Comedy extends Films
{
	void watch(){
		System.out.println("watching comedy movie");
	}
	
}
class Romantic extends Films
{
	void watch(){
		System.out.println("watching romantic movie");
	}
}
class Actionf extends Films
{
	void watch(){
		System.out.println("watching action movie");
	}
}
class Stimulator
{
	static void select(Films f1){
		f1.watch();
	}
}
class MainClass6
{
	public static void main(String[] args){
		Comedy c1 = new Comedy();
		Romantic r1 = new Romantic();
		Actionf a1 = new Actionf();
		Stimulator.select(c1);
		Stimulator.select(r1);
		Stimulator.select(a1);	
	}
}
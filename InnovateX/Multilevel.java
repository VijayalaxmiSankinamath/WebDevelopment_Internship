class Sample2
{
	int y=20;
}
class Demo2 extends Sample2
{
	void cost(){
		System.out.println("Namaste");
	}
}
class Tester2 extends Demo2
{
	void cool(){
		System.out.println("CCOOOOOOOLLLLLLL");
	}
}
 class Multilevel
 {
 public static void main(String[] args){
	 Tester2 t1 = new Tester2();
	 System.out.println(t1.y);
	 t1.cool();
	 Demo2 d1 = new Demo2();
	 System.out.println(d1.y);
	 d1.cost();
 }
 }

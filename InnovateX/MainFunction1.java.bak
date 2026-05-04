interface Train{
    void travel();
    }
	class FirstClass implements Train
	{
		public void travel(){
			System.out.println("First Class");
		}
	}
	class SecondClass implements Train
	{
		public void travel(){
			System.out.println("Second Class");
		}
	}
	class Sleeper implements Train
	{
		public void travel(){
			System.out.println("Sleeper Coach");
		}
	}
	class Stimulator
	{
		static void one(Train t1){
			t1.travel();
		}
	}
	class MainFunction1
	{
		public static void main(String[] args){
		FirstClass f1 = new FirstClass();
		SecondClass s1 = new SecondClass();
		Sleeper s2 = new Sleeper();
		Stimulator.one(f1);
		Stimulator.one(s1);
		Stimulator.one(s2);
		}
		
		
	}
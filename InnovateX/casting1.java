class Samplei{
void disp(){
System.out.println("Hello");
         }
    }
  class Ampules extends Samplei{
  void tata(){
  System.out.println("Tata");
  }
  }
      
    
    class casting1{
       public static void main(String[] args){
         Samplei s1 = new Ampules();
	 s1.disp();
	Ampules a1 = (Ampules)s1;
	a1.tata();
	a1.disp();

	 
	 }
	 }
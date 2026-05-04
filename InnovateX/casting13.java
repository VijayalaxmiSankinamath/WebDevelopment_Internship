class Colai{
int x=10;
void disp(){
System.out.println("Hello");
         }
    }
  class Chungada extends Colai{
  int d=20;
  }
      
    
    class casting14{
       public static void main(String[] args){
         Colai c1 = new Chungada();
	 c1.disp();
	 System.out.println(c1.x);
	Chungada c2 = (Chungada)c1;
	System.out.println(c2.d);
	c2.disp();

	 
	 }
	 }
	 
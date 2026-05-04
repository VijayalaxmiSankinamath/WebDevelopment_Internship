class Demo10{
int x=10;
int z=20;

 }
  class Dumtaka extends Demo10{
  int r=30;
  }
      
    
    class casting11{
       public static void main(String[] args){
         Demo10 d10 = new Dumtaka();
	 System.out.println(d10.x);
	 System.out.println(d10.z);
	Dumtaka d2 = (Dumtaka)d10;
	System.out.println(d2.r);
	

	 
	 }
	 }
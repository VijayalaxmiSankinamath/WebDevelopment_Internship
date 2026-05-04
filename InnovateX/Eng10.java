interface akku10{
  void see(int b,int h);
  }
  class Eng10 {
     public static void main(String[] args){
		 akku10 a10 = (int b, int h) ->{
			 double area =  b * h;
			 System.out.println(area);
		 };
		 a10.see(3,5);
	 }
  }
        
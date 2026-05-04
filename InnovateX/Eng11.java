interface akku11{
  void see(int b,int h);
  }
  class Eng11 {
     public static void main(String[] args){
		 akku11 a11 = (int b, int h) ->{
			 double area =  b * h;
			 System.out.println(area);
		 };
		 a11.see(3,9);
	 }
  }
        
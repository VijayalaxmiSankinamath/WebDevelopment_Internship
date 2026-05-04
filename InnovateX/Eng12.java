interface akku12{
  void see(int a,int b,int h);
  }
  class Eng12 {
     public static void main(String[] args){
		 akku12 a11 = (int a,int b, int h) ->{
			 double area =  0.5 *(a+b) +h;
			 System.out.println(area);
		 };
		 a11.see(3,9,8);
	 }
  }
        
interface akku14{
  void see(int a,int b);
  }
  class Eng14 {
     public static void main(String[] args){
		 akku14 a14 = (int a,int b) ->{
			 double pi = 3.142;
			 double area = pi * a *b;
			 System.out.println(area);
		 };
		 a14.see(2,6);
	 }
  }
        
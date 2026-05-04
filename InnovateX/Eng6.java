interface akku6{
  void see();
  }
  class Eng6 {
     public static void main(String[] args){
		 akku6 a6 = () ->{
			 int a=20;
			 int b=10;
			 double pi = 3.142;
			 double area = pi * a *b;
			 System.out.println(area);
		 };
		 a6.see();
	 }
  }
        
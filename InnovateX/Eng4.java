interface akku4{
  void see();
  }
  class Eng4 {
     public static void main(String[] args){
		 akku4 a4 = () ->{
			 int a=20;
			 int b=40;
			 int h = 40;
			 double area = 0.5 *(a+b) + h;
			 System.out.println(area);
		 };
		 a4.see();
	 }
  }
        
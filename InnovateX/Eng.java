interface akku{
  void see();
  }
  class Eng {
     public static void main(String[] args){
		 akku a1 = () ->{
			 int b=10;
			 int h=20;
			 double area = 0.5 * b * h;
			 System.out.println(area);
		 };
		 a1.see();
	 }
  }
        
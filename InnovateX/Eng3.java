interface akku3{
  void see();
  }
  class Eng3 {
     public static void main(String[] args){
		 akku3 a3 = () ->{
			 int a=20;
			 int b=40;
			 int area = a * b;
			 System.out.println(area);
		 };
		 a3.see();
	 }
  }
        
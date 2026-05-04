interface akku2{
  void see();
  }
  class Eng2 {
     public static void main(String[] args){
		 akku2 a2 = () ->{
			 int a=20;
			 int b=30;
			 int area = a * b;
			 System.out.println(area);
		 };
		 a2.see();
	 }
  }
        
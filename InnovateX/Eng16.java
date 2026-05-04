interface akku16{
  int see();
  }
  class Eng16 {
     public static void main(String[] args){
		 akku16 a16 = () ->{
			 int a=20;
			 int b=30;
			 int area = a * b;
			 return area;
		 };
		 int x = a16.see();
		 System.out.println(x);
	 }
  }
        
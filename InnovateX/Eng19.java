interface akku19{
  int see();
  }
  class Eng19 {
     public static void main(String[] args){
		 akku19 a19 = () ->{
			 int a=20;
			 int b=40;
			 int area = a * b;
			 return area;
			 
		 };
		 int x= a19.see();
		 System.out.println(x);
	 }
  }
        
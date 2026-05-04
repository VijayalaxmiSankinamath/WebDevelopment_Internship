interface akku18{
  int see();
  }
  class Eng18 {
     public static void main(String[] args){
		 akku18 a18 = () ->{
			 int a=20;
			 int b=40;
			 int area = a * b;
			 return area;
			 
		 };
		 int x= a18.see();
		 System.out.println(x);
	 }
  }
        
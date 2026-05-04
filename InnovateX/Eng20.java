interface akku20{
  double see();
  }
  class Eng20 {
     public static void main(String[] args){
		 akku20 a20 = () ->{
			 int a=20;
			 int b=40;
			 int h = 40;
			 double area = 0.5 *(a+b) + h;
			 return area;
			 
		 };
		 double x =a20.see();
		 System.out.println(x);
	 }
  }
        
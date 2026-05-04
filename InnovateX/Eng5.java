interface akku5{
  void see();
  }
  class Eng5 {
     public static void main(String[] args){
		 akku5 a5 = () ->{
			 int r=20;
			 double pi = 3.142;
			 double area = pi * r *r;
			 System.out.println(area);
		 };
		 a5.see();
	 }
  }
        
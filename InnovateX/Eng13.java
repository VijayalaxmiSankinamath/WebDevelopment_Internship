interface akku13{
  void see(int r);
  }
  class Eng13 {
     public static void main(String[] args){
		 akku13 a13 = (int r) ->{
			 double pi = 3.142;
			 double area = pi * r *r;
			 System.out.println(area);
		 };
		 a13.see(6);
	 }
  }
        
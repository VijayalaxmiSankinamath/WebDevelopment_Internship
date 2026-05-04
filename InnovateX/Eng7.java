interface akku7{
  void see();
  }
  class Eng7 {
     public static void main(String[] args){
		 akku7 a7 = () ->{
			 int r = 3;
			 int theta = 45;
			 double area = 0.5 * r *r * theta;
			 System.out.println(area);
		 };
		 a7.see();
	 }
  }
        
interface akku15{
  void see(int r,int theta);
  }
  class Eng15 {
     public static void main(String[] args){
		 akku15 a15 = (int r,int theta) ->{
			 double area = 0.5 * r *r * theta;
			 System.out.println(area);
		 };
		 a15.see(4,45);
	 }
  }
        
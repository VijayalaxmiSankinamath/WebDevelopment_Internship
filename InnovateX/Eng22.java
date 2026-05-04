interface akku22{
  double see();
  }
  class Eng22 {
     public static void main(String[] args){
		 akku22 a22 = () ->{
			 int r = 3;
			 int theta = 45;
			 double area = 0.5 * r *r * theta;
			 return area;
			 
		 };
		 double x = a22.see();
		 System.out.println(x);
		 
	 }
  }
        
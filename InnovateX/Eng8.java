interface akku8{
  void see(int b,int h);
  }
  class Eng8 {
     public static void main(String[] args){
		 akku8 a8 = (int b, int h) ->{
			 double area = 0.5 * b * h;
			 System.out.println(area);
		 };
		 a8.see(3,5);
	 }
  }
        
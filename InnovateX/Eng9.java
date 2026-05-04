interface akku9{
  void see(int a);
  }
  class Eng9 {
     public static void main(String[] args){
		 akku9 a9 = (int a) ->{
			 double area = a* a;
			 System.out.println(area);
		 };
		 a9.see(7);
	 }
  }
        
class Gm21{
   void trape(int a,int b,int c){
   double area=0.5*(a+b)*c;
    System.out.println(area);
    }
  }
    class Mg21{
      public static void main(String[] args){
        Gm21 g1= new Gm21();
	    g1.trape(6,8,9);
	}
}
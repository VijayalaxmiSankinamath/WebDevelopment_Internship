class Gm14{
   void circle(int r){
   final double pi=3.142;
   double area=pi*r*r;
    System.out.println(area);
    }
    }
    class Mg14{
      public static void main(String[] args){
        Gm14 g1= new Gm14();
	g1.circle(7);
	}
}
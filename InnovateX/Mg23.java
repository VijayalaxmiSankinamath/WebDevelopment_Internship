class Gm23{
   void ellipse(int a,int b){
   final double pi=3.142;
   double area=pi*a*b;
    System.out.println(area);
    }
  }
    class Mg23{
      public static void main(String[] args){
        Gm23 g1= new Gm23();
	    g1.ellipse(6,8);
	}
}
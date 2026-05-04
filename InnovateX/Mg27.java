class Gm27{
   double sq(int a){
   double area=a*a;
    return area;
    }
  }
    class Mg27{
      public static void main(String[] args){
        Gm27 g1= new Gm27();
	    double x=g1.sq(6);
	    System.out.println(x);
	}
}
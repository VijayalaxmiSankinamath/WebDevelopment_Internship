class Gm28{
   double sector(int r,int theta){
   double area=0.5*r*r*theta;
    return area;
    }
  }
    class Mg28{
      public static void main(String[] args){
        Gm28 g1= new Gm28();
	    double x=g1.sector(6,60);
	    System.out.println(x);
	}
}
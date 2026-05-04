class Gm24{
   double tri(int a,int b){
   double area=0.5*a*b;
    return area;
    }
  }
    class Mg24{
      public static void main(String[] args){
        Gm24 g1= new Gm24();
	    double x=g1.tri(6,8);
	    System.out.println(x);
	}
}
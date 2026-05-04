class Gm26{
   double parl(int a,int b){
   double area=a*b;
    return area;
    }
  }
    class Mg26{
      public static void main(String[] args){
        Gm26 g1= new Gm26();
	    double x=g1.parl(6,8);
	    System.out.println(x);
	}
}
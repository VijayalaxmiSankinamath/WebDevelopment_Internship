class Gm25{
   double rect(int a,int b){
   double area=a*b;
    return area;
    }
  }
    class Mg25{
      public static void main(String[] args){
        Gm25 g1= new Gm25();
	    double x=g1.rect(6,8);
	    System.out.println(x);
	}
}
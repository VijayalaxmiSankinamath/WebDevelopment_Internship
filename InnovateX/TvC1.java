class TvC1{
    double cost;
    String brand;
    String type;
    TvC1(double cost, String brand,String type){
      this.cost=cost;
      this.brand=brand;
      this.type=type;
      }
      public static void main(String[] args){
        TvC1 t1=new TvC1(90000.00,"Sony","LED");
	System.out.println(t1.cost);
	System.out.println(t1.brand);
	System.out.println(t1.type);
	}
}
class BikeC1{
    double cost;
    String brand;
    String color;
    BikeC1(double cost, String brand,String color){
      this.cost=cost;
      this.brand=brand;
      this.color=color;
      }
      public static void main(String[] args){
        BikeC1 b1=new BikeC1(90000.00,"BMW","blue");
	System.out.println(b1.cost);
	System.out.println(b1.brand);
	System.out.println(b1.color);
	}
}
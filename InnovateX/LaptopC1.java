class LaptopC1{
    double cost;
    String name;
    String brand;
    LaptopC1(double cost,String name,String brand){
      this.cost=cost;
      this.name=name;
      this.brand=brand;
      }
      public static void main(String[] args){
        LaptopC1 l1=new LaptopC1(67000.50,"Lenovo","LOQ");
	System.out.println(l1.cost);
	System.out.println(l1.name);
	System.out.println(l1.brand);
	}
}
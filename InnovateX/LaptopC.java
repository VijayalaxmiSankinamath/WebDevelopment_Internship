class LaptopC{
    double cost;
    String name;
    String brand;
    LaptopC(double a,String b,String c){
      cost=a;
      name=b;
      brand=c;
      }
      public static void main(String[] args){
        LaptopC l1=new LaptopC(67000.50,"Lenovo","LOQ");
	System.out.println(l1.cost);
	System.out.println(l1.name);
	System.out.println(l1.brand);
	}
}
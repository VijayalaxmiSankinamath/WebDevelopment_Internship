class CarC1{
    double cost;
    String model;
    String type;
    CarC1(double cost, String model,String type){
      this.cost=cost;
      this.model=model;
      this.type=type;
      }
      public static void main(String[] args){
        CarC1 c1=new CarC1(900000.00,"Tata","petorl");
	System.out.println(c1.cost);
	System.out.println(c1.model);
	System.out.println(c1.type);
	}
}